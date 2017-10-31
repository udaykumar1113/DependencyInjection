package com.di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static final String HELLO_GURUS="HELLO GURUS!!!!";
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}
}
