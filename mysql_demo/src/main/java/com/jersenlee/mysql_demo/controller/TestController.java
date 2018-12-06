package com.jersenlee.mysql_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("111");
        return "login.html";
    }

}
