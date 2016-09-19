package com.sachinsarawgi.service;

import org.springframework.stereotype.Service;

@Service 
class GreetingMessageServiceImpl implements GreetingMessageService {

	@Override
	public void displayGreetingMessage() {
		
		System.out.println("Hello World");
		System.out.println("This is my first Spring project using minimum spring dependency.");
	}

}
