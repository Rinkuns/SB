package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.RoomMatesEntity;
import com.example.demo.repository.RoomMatesRepo;

@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa01Application.class, args);
		RoomMatesRepo bean = context.getBean(RoomMatesRepo.class);
		
		
		RoomMatesEntity entity=new RoomMatesEntity();
		entity.setName("Gopi");
		entity.setContactnumber(2345676763l);
		entity.setAddress("MUM");
		
		RoomMatesEntity entity2=new RoomMatesEntity();
		entity2.setName("Siku");
		entity2.setContactnumber(2345676764l);
		entity2.setAddress("PURI");
		
		List<RoomMatesEntity> list=new ArrayList<>();
		list.add(entity);
		list.add(entity2);
		
		bean.saveAll(list);
		
		context.close();
	}

}
