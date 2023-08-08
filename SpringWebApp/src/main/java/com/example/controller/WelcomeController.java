package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/Welcome")
	public ModelAndView display() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome to Spring Mvc");
		mav.setViewName("NewFile");
		
		return mav;
	}

}
