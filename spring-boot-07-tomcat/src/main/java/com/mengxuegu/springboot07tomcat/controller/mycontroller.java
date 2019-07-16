package com.mengxuegu.springboot07tomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {
    @ResponseBody
    @RequestMapping("/hello")
    public String hellocontroller (){
        return "hello controller";
    }
}
