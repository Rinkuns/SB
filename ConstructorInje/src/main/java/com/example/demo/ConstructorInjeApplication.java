package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.ren.Car;

@SpringBootApplication
public class ConstructorInjeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConstructorInjeApplication.class, args);
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
