package uy.org.cdi.example;

import javax.enterprise.event.Observes;

public class App {
	public void onEvent(@Observes SimpleEvent ignored, SimpleService service) {
		service.greet();
	}

}
