package com.example.demo.dv;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements Engine {
	@Override
	public Integer Start() {
		System.out.println("Petrol Engine start() called");
		return 0;
	}

}
