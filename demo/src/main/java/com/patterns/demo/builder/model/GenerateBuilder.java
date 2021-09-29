package com.patterns.demo.builder.model;

public class GenerateBuilder {

	public GenerateBuilder() {
		
	}
	
	public String generate() {
		
		return new StringBuilder()
				.append(new FeudalArcherBuilder().toString())
				.append(System.lineSeparator())
				.append(new CastleArcherBuilder().toString())
				.append(System.lineSeparator())
				.append(new ImperialArcherBuilder().toString())
				.toString();

	}
}
