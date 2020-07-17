package com.lee.controller;

import com.lee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 管理员控制器，主要功能为管理员登陆登出
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 跳转到管理员登陆界面
     */
    @GetMapping("/login")
    public String toLogin(){
        return "admin-login";
    }

    /**
     * 管理员登陆
     * @param admin
     * @param password
     * @return
     */
    @PostMapping("/login.do")
    public String login(String admin, String password, HttpServletRequest request){
        boolean isok = adminService.login(admin, password);
        if (isok){
            //登陆成功
            HttpSession session = request.getSession();
            session.setAttribute("admin",admin);
            return "redirect:/admin/alumnis";
        }else{
            //登陆失败
            request.setAttribute("msg","账号或密码有误，请重新登陆！");
            return "admin-login";
        }
    }

    /**
     * 管理员登出
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session){
        //将session置为空
        session.invalidate();
        return "redirect:/admin";
    }
}
