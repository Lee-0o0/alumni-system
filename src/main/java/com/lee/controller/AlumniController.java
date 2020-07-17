package com.lee.controller;

import com.alibaba.excel.EasyExcel;
import com.lee.domain.Alumni;
import com.lee.domain.MyClass;
import com.lee.domain.User;
import com.lee.listener.AlumniListener;
import com.lee.service.AlumniService;
import com.lee.service.MyClassService;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 校友控制器
 */

@Controller
public class AlumniController {

    @Autowired private AlumniService alumniService;

    @Autowired private UserService userService;

    @Autowired private MyClassService myClassService;

    /**
     * 管理员查询所有的校友信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/admin/alumnis")
    public String getAllAlumnis(Model model) {
        List<Alumni> all = alumniService.findAll();
        //将班级编号替换成班级名
        List<String> classes = new ArrayList<>();
        for (Alumni alumni : all) {
            Integer alumniClass = alumni.getAlumniClass();
            if (alumniClass == null) {
                alumniClass = 0;
            }
            MyClass myClass = myClassService.findById(alumniClass);
            String name = "";
            if (myClass != null) {
                name =
                        myClass.getClassMajor()
                                + "-"
                                + myClass.getClassGrade()
                                + "级"
                                + myClass.getClassClass();
            } else {
                name = "未加入班级";
            }
            classes.add(name);
        }
        model.addAttribute("alumnis", all);
        model.addAttribute("classes", classes);
        //跳转到alumnis.jsp页面
        return "alumnis";
    }


    /**
     * 用户校友查询自己的具体信息
     *
     * @param number 校友学号
     * @return
     */
    @GetMapping("/alumni/{number}")
    public String getAlumni(@PathVariable String number,HttpServletRequest request) {
        Alumni alumni = alumniService.findByNumber(number);
        request.setAttribute("alumni",alumni);
        request.getSession().setAttribute("username",alumni.getAlumniNumber());
        return  "user-info";
    }

    /**
     * 管理员添加校友信息
     *
     * @param alumni
     * @return
     */
    @PostMapping("/admin/alumni")
    public String insert(Alumni alumni) {
        alumniService.insert(alumni);
        //同时添加用户，密码与学号相同
        User user = new User();
        user.setUserUsername(alumni.getAlumniNumber());
        user.setUserPassword(alumni.getAlumniNumber());
        userService.register(user);
        return "redirect:/admin/alumnis";
    }

    /**
     * 管理员更新校友信息
     * @param alumni
     * @return
     */
    @PostMapping("/admin/updatealumni")
    public String update(Alumni alumni) {
        alumniService.update(alumni);
        return "redirect:/admin/alumnis";
    }

    /**
     * 用户更新自己的信息
     * @param alumni
     * @return
     */
    @PostMapping("/userupdatealumni")
    public String updateByUser(Alumni alumni) {
        alumniService.update(alumni);
        return "redirect:/alumni/"+alumni.getAlumniNumber();
    }

    /**
     * 管理员删除校友信息
     *
     * @param number
     * @return
     */
    @RequestMapping("/admin/deletealumni/{number}")
    public String delete(@PathVariable String number) {
        alumniService.delete(number); // 删除校友信息
        userService.delete(number); // 同时删除用户信息
        return "redirect:/admin/alumnis";
    }

    /**
     * 管理员批量导入校友信息
     * @param file
     * @param request
     * @return
     */
    @RequestMapping("/admin/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String appendix =
                file.getOriginalFilename().substring(file.getOriginalFilename().indexOf('.') + 1);
        //如果文件为空或者不是EXCEL文件
        if (file.isEmpty() || (!"xls".equals(appendix) && !"xlsx".equals(appendix))) {
            request.setAttribute("msg", "批量导入失败,请选择正确的EXCEL文件");
            return "forward:/admin/alumnis";
        }
        try {
            EasyExcel.read(
                            file.getInputStream(),
                            Alumni.class,
                            new AlumniListener(alumniService, userService))
                    .sheet()
                    .doRead();
            request.setAttribute("msg", "批量导入成功");
            return "forward:/admin/alumnis";
        } catch (IOException e) {
            e.printStackTrace();
        }
        request.setAttribute("msg", "批量导入失败，请重试");
        return "forward:/admin/alumnis";
    }

    /**
     * 管理员批量导出校友信息
     * @param response
     */
    @RequestMapping("/admin/download")
    public void download(HttpServletResponse response) {
        //读取所有的校友列表
        List<Alumni> alumnis = alumniService.findAll();

        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        try {
            String filename = URLEncoder.encode("校友列表","UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + filename + ".xlsx");
            EasyExcel.write(response.getOutputStream(), Alumni.class).sheet("sheet1").doWrite(alumnis);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
