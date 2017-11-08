package com.scan.service;

import org.springframework.stereotype.Service;

import com.di.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static final String HELLO_GURUS="HELLO GURUS!!!!";
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}
}
