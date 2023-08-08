package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.repository.CustomerRepo;

@SpringBootApplication
public class SpringDataJpa03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa03Application.class, args);
		CustomerRepo repo = context.getBean(CustomerRepo.class);
		
		/*//find based on Email
		 * CustomerEntity entity =
		 * repo.findByCustomerEmail("minaketan.rinkun@gmail.com");
		 * System.out.println(entity);
		 */
		
		/*//Find based on name and Email
		 * CustomerEntity entity = repo.findByCustomerNmaeAndCustomerEmail("Minaketan",
		 * "minaketan.rinkun@gmail.com"); System.out.println(entity);
		 */
		//custom Query
		/*
		 * List<String> names = repo.findAllNames(); System.out.println(names);
		 */
		List<String> names = repo.findCustomerNames();
		System.out.println(names);
	}

}
