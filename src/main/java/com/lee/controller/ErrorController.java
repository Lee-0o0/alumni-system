package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误页面控制器
 */
@Controller
public class ErrorController {
    @RequestMapping("/404")
    public String error404(){
        return "404";
    }

    @RequestMapping("/500")
    public String error500(){
        return "500";
    }
}
