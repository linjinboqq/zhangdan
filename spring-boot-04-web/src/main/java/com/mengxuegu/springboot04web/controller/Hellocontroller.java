package com.mengxuegu.springboot04web.controller;

import com.mengxuegu.springboot04web.bean.user;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class Hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    String Hello() {
        return "hello linjinbo";
    }

    @RequestMapping("/success")
    String success(Map<String, Object> map) {
        map.put("name", "林");
        return "success";
    }

    @RequestMapping("/user")
    String user(Map<String, Object>map, HttpServletRequest httpserv) {
        List list = new ArrayList();
        list.add(new user("ajdf", 18));
        list.add(new user("ajdfdsf", 156));
        list.add(new user("ajerdf", 8));
        list.add(new user("ajdfwe", 138));
        map.put("userlist",list);
        map.put("sex","女");
        Object put = map.put("sex2", "女");
//        map.put("userkey",new user("lin",13));
         httpserv.getSession().setAttribute("keyuser", new user("linjinbo", 19));
        return  "study";
    }

}
