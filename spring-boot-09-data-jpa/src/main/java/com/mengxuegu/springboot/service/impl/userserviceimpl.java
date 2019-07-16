package com.mengxuegu.springboot.service.impl;

import com.mengxuegu.springboot.dao.Userrepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class userserviceimpl implements UserService {
    @Autowired
    Userrepository userrepository;

    @Override
    @Transactional( isolation= Isolation.DEFAULT,propagation= Propagation.REQUIRED)
    public Boolean add(User user) {
        System.out.println("add....");
        userrepository.save(new User("1", "1"));
        userrepository.save(new User("12", "2"));
        userrepository.save(new User("123", "3"));
        userrepository.save(new User("1234", "4"));
        userrepository.save(new User("12345", "5"));
//        userrepository.save(new User("123456","6"));
//        这里有一个问题 就是  我的主键为什么不删除
        userrepository.save(user);
        System.out.println( "sava "+user);
        return true;
    }
}
