package com.regenaration.webapp.myspringapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.regeneration.webapp.myspringapplication")
public class MySpringApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}
}
