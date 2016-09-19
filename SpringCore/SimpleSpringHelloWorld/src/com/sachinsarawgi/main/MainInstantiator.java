package com.sachinsarawgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sachinsarawgi.service.GreetingMessageService;

public class MainInstantiator {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl", GreetingMessageService.class);
		greetingMessageService.displayGreetingMessage();
	}
}
