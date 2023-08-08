package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecoProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SecoProjApplication.class, args);
		int beanDefinationCount = context.getBeanDefinitionCount();
		System.out.println("Bean Def:"+beanDefinationCount);
	}
}
