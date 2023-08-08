package com.example.demo.bean;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("dw")
public class DataReader {

	public DataReader() {
		System.out.println("Logic to read Data");
	}
}
