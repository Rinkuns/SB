package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NormApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(NormApplication.class, args);
		hrm hr=run.getBean(hrm.class);
		hr.start();
	}

}
