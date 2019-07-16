package com.mengxuegu.springboot01init02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {
    @ResponseBody
    @RequestMapping("/info")
    public  String init(){
        System.out.println("kdfd");
        return "hello init....lin";
    }
}
