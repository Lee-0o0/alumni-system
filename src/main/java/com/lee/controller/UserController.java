package com.lee.controller;

import com.lee.domain.User;
import com.lee.service.AlumniService;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 用户控制器
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AlumniService alumniService;

    /**
     * 登陆验证
     * @param username
     * @param password
     * @param request
     * @return
     */
    @PostMapping("/login.do")
    public String loginDo(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          HttpServletRequest request,
                          HttpServletResponse response){
        boolean isok = userService.login(username, password);
        if (isok){
            //登陆成功，重定向到首页
            request.setAttribute("username",username);
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            return "redirect:/alumni/"+username;
        }else {
            //登陆失败
            request.setAttribute("msg","学号或密码有误！请重新登陆");
            return "user-login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "user-login";
    }

    /**
     * 校友修改密码
     * @param username
     * @param password
     * @param confirmPassword
     * @param request
     * @return
     */
    @PostMapping("/updatepassword")
    public String updatePassword(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String confirmPassword,
                                 HttpServletRequest request){
        if (!password.equals(confirmPassword)){
            request.setAttribute("msg","修改密码失败");
            return "fail";
        }
        User user = userService.selectByUsername(username);
        if (user != null){
            user.setUserPassword(password);
            boolean b = userService.update(user);
            if (b){
                return "redirect:/alumni/"+username;
            }else {
                request.setAttribute("msg","修改密码失败");
                return "fail";
            }
        }
        request.setAttribute("msg","修改密码失败");
        return "fail";
    }
}
