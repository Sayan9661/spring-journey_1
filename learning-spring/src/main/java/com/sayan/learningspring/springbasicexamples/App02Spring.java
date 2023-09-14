package com.sayan.learningspring.springbasicexamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Spring {

	public static void main(String args[]) { 
		
	try(var context=new AnnotationConfigApplicationContext(SpringHelloConfig.class))
	{
	
	System.out.println(context.getBean("name"));
	
	System.out.println(context.getBean("person"));
	
	System.out.println(context.getBean("address2"));
	

	System.out.println(context.getBean("person"));
	}
	}
}
