package com.slaura.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	@Autowired
	private Greeting greeting;
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return greeting.getText();	
	}

}
