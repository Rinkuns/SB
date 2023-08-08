package com.example.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.start.entities.ResourceEntity;
import com.example.start.repository.ResourceRepo;

@SpringBootApplication
public class SpringDataJpaGenerator1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaGenerator1Application.class, args);
		ResourceRepo repo = context.getBean(ResourceRepo.class);
		
		ResourceEntity entity=new ResourceEntity();
		
		//entity.setResourceId(20766);//no need to set RESOURCE_ID because of generator. which is already specified in 
       									//entity class for the primary key column
		entity.setResourceName("Rinku");
		entity.setResourceExp("1 years");
		entity.setResourceSkill("Full Stack");
		
		ResourceEntity resourceEntity = repo.save(entity);
		System.out.println("Record inserted with ::"+resourceEntity.getResourceId());
		context.close();
	}

}
  