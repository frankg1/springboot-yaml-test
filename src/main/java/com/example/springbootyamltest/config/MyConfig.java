package com.example.springbootyamltest.config;

import com.example.springbootyamltest.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* @configuration 表名这是一个配置类，来提到之前的xml配置bean的方法
* xml中使用<bean></bean>这样的方法去配置bean
* */

@Configuration
public class MyConfig {
    @Bean
    //函数名就是bean id
    public HelloService helloService(){
        return new HelloService();
    }
}
