package com.example.demo.reb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car constructor");
	}
	@Autowired
	private Engine eng;
	
	
	public void Drive() {
		Integer integer = eng.start();
		if(integer==0) {
			System.out.println(" Engine started ");
		}
	}

}
