package com.mengxuegu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启事务管理
@SpringBootApplication
public class SpringBoot09DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09DataJpaApplication.class, args);
    }

}
