package springframework.didemo.controllers;

import springframework.didemo.services.GreetingService;

/*
This is the most preferred way
	Types of DI : Example of DI without Spring
	1) By Class propertes - least preferred [using private property is evil] => PropertyInjectedController.java
	2) By Setters - Area of much debate => SetterInjectedController.java
	3) By Constructor - Most preferred => ConstructorInjectedController.java
*/
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
