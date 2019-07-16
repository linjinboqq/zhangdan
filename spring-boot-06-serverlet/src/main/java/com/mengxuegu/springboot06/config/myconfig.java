package com.mengxuegu.springboot08.config;

import com.mengxuegu.springboot08.filter.myfilter;
import com.mengxuegu.springboot08.serverlet.myserverlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class myconfig {
    @Bean
    public ServletRegistrationBean helloservlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new myserverlet(), "/myservlet");
        return bean;
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new myfilter());
        bean.setUrlPatterns(Arrays.asList("/myservlet"));
        return bean;
    }


}
