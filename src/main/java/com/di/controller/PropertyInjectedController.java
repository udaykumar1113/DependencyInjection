package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.service.GreetingServiceImpl;
@Controller
public class PropertyInjectedController {
	@Autowired
	GreetingServiceImpl greetingService;
	
    public String sayHello(){
    	return greetingService.sayGreeting();
    }
}
