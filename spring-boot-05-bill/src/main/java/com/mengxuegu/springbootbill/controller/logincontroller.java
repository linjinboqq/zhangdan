package com.mengxuegu.springbootbill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class logincontroller {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        HttpSession httpSession, Map<String , Object> map) {
//        HttpServletRequest httpServletRequest1 = httpServletRequest;
//        String password = httpServletRequest1.getParameter("password");
//        String username = httpServletRequest1.getParameter("username");
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            httpSession.setAttribute("loginuser",username);
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名或密码错误");
            return "main/login";
        }


    }
 @RequestMapping("/logout")
    public  String  logout (HttpSession session){
//        清空session
        session.removeAttribute("loginuser");
        session.invalidate();
        return "redirect:/index";

    }

    @RequestMapping ("/bills")
public  String error(){

        int a=5/0;
        //这里可以抛出throw new.....
        System.out.println("return......");
        return "";
    }
}
