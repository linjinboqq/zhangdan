package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    String Hello() {
        return "hello linjinbo";
    }

}
