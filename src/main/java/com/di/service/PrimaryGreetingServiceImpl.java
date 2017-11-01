package com.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		
		return "Primary Greeting service";
	}

}
