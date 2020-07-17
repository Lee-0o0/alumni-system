package com.lee.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object admin = request.getSession().getAttribute("admin");
//        if (request.getRequestURL().indexOf("/admin/login")>=0 || request.getRequestURL().indexOf("/admin")>=0){
//            // 登陆界面
//            System.out.println("------------");
//            return true;
//        }
        if (admin == null){
            //未登录，跳转到登陆界面
            request.setAttribute("msg","没有权限，请先登陆");
            request.getRequestDispatcher("/admin/login").forward(request,response);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
