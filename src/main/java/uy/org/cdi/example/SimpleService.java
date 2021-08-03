package uy.org.cdi.example;

import javax.inject.Inject;

public class SimpleService {
	@Inject 
	private Hello greeter;
	
	public void greet() {
		greeter.greet();
	}
}
