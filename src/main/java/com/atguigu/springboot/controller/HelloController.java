package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shawn.Yang
 * @create 2020-05-16-16:05
 */
@Controller
public class HelloController {

    @RequestMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg","你好。");
        return "success";//配置SpringMVC InternalViewResolver
//        return "forward:/WEB-INF/success.jsp";//未配置SpringMVC InternalViewResolver
    }
}
