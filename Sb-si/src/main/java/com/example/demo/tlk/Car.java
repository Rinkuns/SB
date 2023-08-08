package com.example.demo.tlk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Pe")
public class Car {
	
	private Engine eng;
	
	
	@Autowired
	public void setEng(Engine eng) {
		System.out.println("Setter called");
		this.eng = eng;
	}
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car const");
	}
	public void Drive() {
		Integer engStatus=eng.Eng();
		if (engStatus == 0) {
			System.out.println("Engine started");
		}
	}

}
