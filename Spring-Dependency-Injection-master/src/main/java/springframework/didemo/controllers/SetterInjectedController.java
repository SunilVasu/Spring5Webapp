package springframework.didemo.controllers;

import springframework.didemo.services.GreetingService;

public class SetterInjectedController {
	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
