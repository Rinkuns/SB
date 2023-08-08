package com.example.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.start.entity.ResourceEntity;
import com.example.start.repository.ResourceRepo;

@SpringBootApplication
public class SpringDataJpaCustomGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaCustomGeneratorApplication.class, args);
		ResourceRepo bean = context.getBean(ResourceRepo.class);
		
		ResourceEntity entity=new ResourceEntity();
		//entity.setResourceId(100);//No need acc. to gennerator
		entity.setResourceName("Sid");
		entity.setResourceExp("1 year");
		entity.setResourceSkill("UI");
		
		ResourceEntity resourceEntity = bean.save(entity);
		System.out.println("table inserted with::"+resourceEntity.getResourceId());
		context.close();
	}

}
