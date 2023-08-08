package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.repository.CustomerRepo;

@SpringBootApplication
public class SpringDataJpa02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa02Application.class, args);
		CustomerRepo bean = context.getBean(CustomerRepo.class);
		
		CustomerEntity entity=new CustomerEntity();
		entity.setCustomerId(207);
		entity.setCustomerName("Pintu");
		entity.setCustomerEmail( "Pintu@gmail.com");
		
		bean.save(entity);
	}

}
