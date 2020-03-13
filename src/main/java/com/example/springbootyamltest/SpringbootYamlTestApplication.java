package com.example.springbootyamltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication
public class SpringbootYamlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootYamlTestApplication.class, args);
	}

}
