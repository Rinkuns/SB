package com.example.demo.re;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car constructor");
	}
	
	private Engine eng;
	@Autowired
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	
	public void Drive() {
		Integer engStatus = eng.start();
		if (engStatus==0) {
			System.out.println("@@ Journey Started @@");
		}
	}
	

}
