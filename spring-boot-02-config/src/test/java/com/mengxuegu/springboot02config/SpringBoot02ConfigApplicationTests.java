package com.mengxuegu.springboot02config;

import com.mengxuegu.springboot02config.bean.emp;
import com.mengxuegu.springboot02config.service.myservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired//注入的注解
    emp  emp;
    @Test
    public void contextLoads() {
        System.out.println(emp);
    }
    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void aa(){
//        myservice myservice = (com.mengxuegu.springboot02config.service.myservice) applicationContext.getBean("myservice");
//        myservice.add();
//        System.out.println(myservice);
        myservice myservice=(com.mengxuegu.springboot02config.service.myservice)applicationContext.getBean("idservice");
        System.out.println(myservice);
        myservice.add();


    }

}
