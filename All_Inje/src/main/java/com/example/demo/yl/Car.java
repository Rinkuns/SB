package com.example.demo.yl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {

	/*FI*/
	@Autowired  
	private Engine eng;
	
	/*CI/@Autowired
	public Car(Engine eng) {
		// TODO Auto-generated constructor stub
		System.out.println("Car Const");
		this.eng=eng;
	}*/
	
	/*SI/@Autowired
	public void setEng(Engine eng) {
		this.eng = eng;
	}*/
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("ZCar Con6st");
	}

	
	public void drive() {
		Integer engStatus = eng.Start();
		if(engStatus==0) {
			System.out.println("journey Started");
		}
	}
	
}
