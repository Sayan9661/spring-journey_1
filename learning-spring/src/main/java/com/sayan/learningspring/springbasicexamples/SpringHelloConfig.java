package com.sayan.learningspring.springbasicexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name , int age,Address address) {};
record Address(String firstline, String city) {};

@Configuration
public class SpringHelloConfig {

	@Bean
	public String name() {
		return "sayan";
	}
	@Bean
	public int age() {
		return 25;
	}
	@Bean
	public Person person() {
		return new Person("Ravi",22, new Address("ddd","ddees"));	
	}
	@Bean
	public Person person3parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("254 east","brroklyn");
	}
	@Bean(name="address3")
	public Address addresslol() {
		return new Address("habijabi","uluria");
	}

//	@Bean
//	public {
//		return "sayan";
//	}
//	@Bean
//	public {
//		return "sayan";
//	}
}
