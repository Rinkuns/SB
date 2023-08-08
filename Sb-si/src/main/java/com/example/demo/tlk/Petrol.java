package com.example.demo.tlk;

import org.springframework.stereotype.Component;

@Component("Pe")
public class Petrol {
public Petrol() {
	// TODO Auto-generated constructor stub
	System.out.println("petrol constr");
}
public Integer Eng() {
	return 9;
}
}
