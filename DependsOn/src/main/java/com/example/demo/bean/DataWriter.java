package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("dw")
public class DataWriter {
	
	public DataWriter() {
		System.out.println("Logic to write the data");
	}

}
