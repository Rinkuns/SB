package com.example.demo.ren;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Zero param consdblsh");
	}
	
	private Engine eng;
	@Autowired
	
	public Car(Engine eng) {
		// TODO Auto-generated constructor stub
		System.out.println("Car Constructor");
		this.eng = eng;
	}
	
	public void drive() {
		Integer engStatus = eng.start();
		if (engStatus==0) {
			System.out.println("EJourney Started");
		}
	}
	
}
