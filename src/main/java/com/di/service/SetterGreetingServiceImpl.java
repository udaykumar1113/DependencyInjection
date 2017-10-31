package com.di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
	
	@Override
	public String sayGreeting()
	{
		return "Injected using Getter greeting service";
		
	}
}
