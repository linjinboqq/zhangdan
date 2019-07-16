package com.mengxuegu.springbootbill.config;

import com.mengxuegu.springbootbill.component.mylocalresolver;
import com.mengxuegu.springbootbill.interceptor.Logininterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//标明配置类
@Configuration
public class myconfig {

//    给容器管理
    @Bean
    public WebMvcConfigurer WebMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {

                registry.addInterceptor(new Logininterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/index")
                .excludePathPatterns("/css/*","/js/*","/img/*");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/main.html").setViewName("main/index");
                registry.addViewController("/index").setViewName("main/login");
                registry.addViewController("/").setViewName("main/login");
            }
        };
    }
    @Bean
    LocaleResolver localeResolver(){
        return new mylocalresolver();
    }


}
