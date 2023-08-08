package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.ContactMasterEntity;
import com.example.demo.repository.ContactMasterRepo;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		
		/*
		 * ContactMasterEntity entity=new ContactMasterEntity();
		 * entity.setContactId(102); entity.setContactName("Chiku");
		 * entity.setContactNumber(7749014171l); bean.save(entity);
		 * entity.setContactId(104); entity.setContactName("SH");
		 * entity.setContactNumber(8114708092l); bean.save(entity);
		 * //System.out.println("+++++++>"+bean.getClass().getName());
		 */		
		/*
		 * Optional<ContactMasterEntity> id = bean.findById(100); if(id.isPresent()) {
		 * System.out.println(id.get()); }
		 */
		
		/*
		 * Iterable<ContactMasterEntity> findAll = bean.findAll();
		 * findAll.forEach(entity ->{ System.out.println(entity); });
		 */
		bean.deleteById(104);
		
		context.close();
	}

}
