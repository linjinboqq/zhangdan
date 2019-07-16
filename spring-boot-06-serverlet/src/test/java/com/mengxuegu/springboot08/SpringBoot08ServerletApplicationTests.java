package com.mengxuegu.springboot08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot08ServerletApplicationTests {

    @Test
    public void contextLoads() {
         new WebServerFactoryCustomizer(){

             @Override
             public void customize(WebServerFactory factory) {

             }
         };
    }


}
