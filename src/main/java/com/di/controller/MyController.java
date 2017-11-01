package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String sayHello(){
		System.out.println("Controller accessed using spring context bean");
		System.out.println(greetingService.sayGreeting());
		return greetingService.sayGreeting();
	}
}
