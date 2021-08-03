package uy.org.cdi.example;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class CDIMain {
	public static void main(String[] args) {
		SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
		SeContainer container = containerInit.initialize();
		
		//Disparamos el evento asincrono
		container.getBeanManager().fireEvent(new SimpleEvent());
		
		container.close();
		
		System.exit(0);
	}
}
