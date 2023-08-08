package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.yl.Car;

@SpringBootApplication
public class AllInjeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AllInjeApplication.class, args);
		Car car=context.getBean(Car.class);
		car.drive();
	}

}
