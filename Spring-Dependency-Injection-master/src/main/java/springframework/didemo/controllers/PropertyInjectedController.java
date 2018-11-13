package springframework.didemo.controllers;

import springframework.didemo.services.GreetingServiceImpl;

//this is the least preferred way to do DI
public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
