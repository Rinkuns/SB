package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.reb.Car;

@SpringBootApplication
public class FieldInjeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FieldInjeApplication.class, args);
		Car car = context.getBean(Car.class);
		car.Drive();
	}

}
