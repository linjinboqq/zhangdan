package com.mengxuegu.springboot02config.config;

import com.mengxuegu.springboot02config.bean.emp;
import com.mengxuegu.springboot02config.service.myservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfig {
    @Bean
   public myservice idservice(){
       System.out.println( "组件注入");
       return  new myservice();
   }

}
