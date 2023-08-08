package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.tlk.Car;

@SpringBootApplication
public class SbSiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbSiApplication.class, args);
		Car bean = context.getBean(Car.class);
		bean.Drive();
	}

}
