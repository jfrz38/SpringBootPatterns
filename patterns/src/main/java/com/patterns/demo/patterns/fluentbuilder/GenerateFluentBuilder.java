package com.patterns.demo.patterns.fluentbuilder;

public class GenerateFluentBuilder {
	
	public GenerateFluentBuilder() {
			
	}
	
	public String generate() {
		
		// Fluent interface
		return new Car.Builder()
					.cvs(100)
					.seats(false)
					.model("Ford")
					.build()
					.toString();

	}
}
