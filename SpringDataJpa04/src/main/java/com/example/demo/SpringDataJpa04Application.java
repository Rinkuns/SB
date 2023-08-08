package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.repository.CustomerRepo;

@SpringBootApplication
public class SpringDataJpa04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa04Application.class, args);
		CustomerRepo repo = context.getBean(CustomerRepo.class);
		
		//Pagination
		
		int pageNo=0;
		int pageSize=3;
		
		//PageRequest request = PageRequest.of(pageNo, pageSize);
		
		Page<CustomerEntity> list = repo.findAll(PageRequest.of(pageNo, pageSize));
		list.forEach(entity->{
			System.out.println(entity);
		});
		/*
		 * //Sorting List<CustomerEntity> list =
		 * repo.findAll(Sort.by("customerName").ascending()); list.forEach(entity->{
		 * System.out.println(entity); });
		 */
		
	}

}
