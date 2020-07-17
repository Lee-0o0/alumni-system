package com.lee.controller;

import com.lee.domain.Alumni;
import com.lee.domain.MyClass;
import com.lee.service.AlumniService;
import com.lee.service.MyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 班级管理控制器
 */
@Controller
public class MyClassController {

    @Autowired
    private MyClassService myClassService;
    @Autowired
    private AlumniService alumniService;

    /**
     * 管理员获取所有班级信息
     * @param request
     * @return
     */
    @RequestMapping("/admin/classes")
    public String findAll(HttpServletRequest request){
        List<MyClass> all = myClassService.findAll();
        for (MyClass myClass:all){
            Alumni alumni = alumniService.findByNumber(myClass.getClassCreator());
            if (alumni == null){
                //如果创始人不存在，则将班级创始人修改为已注销
                myClass.setClassCreator(myClass.getClassCreator()+"(已注销)");
            }
        }
        request.setAttribute("classes",all);
        return "classes";
    }

    /**
     * 管理员获取某一个班级信息，包括其校友列表
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/admin/class/{id}")
    public String findByClassId(@PathVariable int id,HttpServletRequest request){
        MyClass myClass = myClassService.findById(id);
        List<Alumni> alumnis = alumniService.findByClassId(id);
        request.setAttribute("creator",myClass.getClassCreator());
        request.setAttribute("alumnis",alumnis);
        return "alumnis";
    }

    /**
     * 某校友查看班级信息
     * @param alumniNumber
     * @param request
     * @return
     */
    @GetMapping("/class")
    public String findClassByUser(@RequestParam String alumniNumber,
                                  HttpServletRequest request){
        Alumni alumni = alumniService.findByNumber(alumniNumber);
        Integer alumniClass = alumni.getAlumniClass();
        //如果加入了班级，则查询同学信息
        if (alumniClass != null) {
            MyClass myClass = myClassService.findById(alumniClass);
            request.setAttribute("myclass",myClass);
            List<Alumni> classmates = alumniService.findByClassId(myClass.getClassId());
            request.setAttribute("classmates",classmates);
            return "class-info";
        }else {
            //还未加入班级
            request.setAttribute("msg","您还未加入班级");
            //推荐班级
            String alumniMajor = alumni.getAlumniMajor();
            String alumniGrade = alumni.getAlumniGrade();
            List<MyClass> classes = myClassService.findByGradeAndMajor(alumniGrade, alumniMajor);
            request.setAttribute("classes",classes);
            request.setAttribute("alumni",alumni);
            return "into-class";
        }
    }

    /**
     * 管理员新建班级
     * @param myClass
     * @param request
     * @param response
     */
    @PostMapping("/admin/class")
    public String insertByAdmin(MyClass myClass,
                              HttpServletRequest request,
                              HttpServletResponse response){
        //首先根据专业、年级、班查询是否已存在该班级
        String classMajor = myClass.getClassMajor();
        String classGrade = myClass.getClassGrade();
        String classClass = myClass.getClassClass();
        List<MyClass> classes = myClassService.findByMajorAndGradeAndClass(classMajor, classGrade, classClass);
        if (classes.size() != 0){
            //表示已存在这样的班级
            request.setAttribute("msg","该班级已存在");
            return "fail";
        }
        boolean isok = myClassService.insert(myClass);
        if (!isok){
            request.setAttribute("msg","创建失败");
            return "fail";
        }
        return "redirect:/admin/classes";
    }

    /**
     * 用户创建班级
     * @param myClass
     * @return
     */
    @PostMapping("/createclass")
    public String insert(MyClass myClass,
                         HttpServletRequest request,
                         HttpServletResponse response){
        System.out.println("----------------");
        //首先根据专业、年级、班查询是否已存在该班级
        String classMajor = myClass.getClassMajor();
        String classGrade = myClass.getClassGrade();
        String classClass = myClass.getClassClass();
        List<MyClass> classes = myClassService.findByMajorAndGradeAndClass(classMajor, classGrade, classClass);
        if (classes.size() != 0){
            //表示已存在这样的班级
            request.setAttribute("msg","该班级已存在");
            return "fail";
        }
        boolean isok = myClassService.insert(myClass);
        if (!isok){
            request.setAttribute("msg","创建失败");
            return "fail";
        }
        return "redirect:/class?alumniNumber="+request.getSession().getAttribute("username");
    }

    /**
     * 校友加入班级
     * @param classId
     * @param alumniNumber
     * @return
     */
    @RequestMapping("/joinclass")
    public String joinClass(@RequestParam int classId,@RequestParam String alumniNumber){
        //将校友的班级字段修改为加入的班级
        boolean a = alumniService.joinClass(alumniNumber, classId);
        if (a){
            MyClass myClass = myClassService.findById(classId);
            myClass.setClassNumberOfMember(myClass.getClassNumberOfMember() + 1);
            boolean b = myClassService.update(myClass);
            if (b){
                return "redirect:/class?alumniNumber="+alumniNumber;
            }
        }
        return "redirect:/class?alumniNumber="+alumniNumber;
    }

    /**
     * 管理员修改班级信息
     * @param myClass
     * @return
     */
    @PostMapping("/admin/updateclass")
    public String update(MyClass myClass){
        boolean isok = myClassService.update(myClass);
        return "redirect:/admin/classes";
    }

    /**
     * 管理员删除班级
     * @param id
     * @return
     */
    @RequestMapping("/admin/deleteclass/{id}")
    public String delete(@PathVariable int id){
        //删除班级
        myClassService.delete(id);
        //将处于该班级的同学剔除出去
        List<Alumni> alumniList = alumniService.findByClassId(id);
        for (Alumni alumni:alumniList){
            alumni.setAlumniClass(null);
            alumniService.updateWithNull(alumni);
        }
        return "redirect:/admin/classes";
    }


}
