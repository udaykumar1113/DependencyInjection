package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.service.GreetingService;
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;
	
	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayGreeting();
	}

}
