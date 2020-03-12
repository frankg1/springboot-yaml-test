package com.example.springbootyamltest;

import com.example.springbootyamltest.bean.Person;


import org.apache.catalina.core.StandardContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/*
*Sprning boot单元测试功能
*可以再测试期间很方便的类似编码一样进行自动注入的功能
* */

@SpringBootTest
class SpringbootYamlTestApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;


    @Test
    public void helloTest(){


        Boolean  b =ioc.containsBean("person");
        System.out.println(b);

    }

	@Test
	void contextLoads() {

        System.out.println(person);
        //helloTest();
    }

}
