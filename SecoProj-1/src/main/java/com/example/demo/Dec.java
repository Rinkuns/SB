package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dec {
	@PostMapping
	public String welcom() {
		return "Welcome to my page";
	}
}
