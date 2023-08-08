package com.example.demo.dv;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Engine {
	
	@Override
	public Integer Start() {
		System.out.println("Diesel Engine Start() called");
		return 0;
	}

}
