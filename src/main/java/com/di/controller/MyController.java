package com.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String sayHello(){
		System.out.println("Controller accessed using spring context bean");
		return "foo";
	}
}
