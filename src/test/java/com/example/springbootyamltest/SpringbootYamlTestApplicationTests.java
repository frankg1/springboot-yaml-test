package com.example.springbootyamltest;

import com.example.springbootyamltest.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
*Sprning boot单元测试功能
*可以再测试期间很方便的类似编码一样进行自动注入的功能
* */

@SpringBootTest
class SpringbootYamlTestApplicationTests {

    @Autowired
    Person person;

	@Test
	void contextLoads() {
        System.out.println(person);
    }

}
