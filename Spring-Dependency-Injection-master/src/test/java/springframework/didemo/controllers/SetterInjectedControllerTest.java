package springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, this.setterInjectedController.sayHello());
	}
}
