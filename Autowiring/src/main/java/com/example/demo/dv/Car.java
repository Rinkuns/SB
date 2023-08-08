package com.example.demo.dv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Car {
	@Autowired
	@Qualifier("pe")
	private Engine eng;

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car const");
	}
	
	public void Drive() {
		Integer status = eng.Start();
		if(status==0) {
			System.out.println("Engine Started");
		}
	}
}
