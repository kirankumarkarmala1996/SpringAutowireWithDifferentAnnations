package com.AutowireAnnatation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Human hum=context.getBean("human",Human.class);
		hum.startPumping(); 
		
	}

}
