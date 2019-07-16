package com.mengxuegu.springboot.contrlloer;

import com.mengxuegu.springboot.dao.Userrepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.UserService;
import com.mengxuegu.springboot.service.impl.userserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class usercontrller {
    @Autowired
    Userrepository userrepository;

    @ResponseBody
    @GetMapping("user/{id}")
    public User getuserbyid(@PathVariable("id") Integer id) {
        Optional<User> byId = userrepository.findById(id);
        User user = byId.get();
        return user;
    }

    @ResponseBody
    @GetMapping("/user")
    public User add(User user) {
        User user1 = userrepository.save(user);
        return user1;

    }
//面向接口编程 不注入impl 实现
    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/user2")
    public User adduser2(User user) {
        System.out.println("addusser2......" + user);
        userService.add(user);
        return user;
    }

}
