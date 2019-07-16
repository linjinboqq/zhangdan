package com.mengxuegu.springbootbill.controller;

import com.mengxuegu.springbootbill.entities.User;
import com.mengxuegu.springbootbill.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class logincontroller {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        HttpSession httpSession, Map<String , Object> map) {
//        HttpServletRequest httpServletRequest1 = httpServletRequest;
//        String password = httpServletRequest1.getParameter("password");
//        String username = httpServletRequest1.getParameter("username");

        if(!StringUtils.isEmpty(username)&&
                !StringUtils.isEmpty(password)){
            User user = userMapper.getUserByUsername(username);
            if(user!=null&&user.getPassword().equals(password)){
//                            登陆成功
                httpSession.setAttribute("loginuser",user);
                return "redirect:/main.html";
            }
        }
        //登陆失败
            map.put("msg", "用户名或密码错误");
            return "main/login";


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
