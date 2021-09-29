package com.patterns.demo.facade.model;

public class GenerateFacade {

	public GenerateFacade() {
		
	}
	
	public String generate() {
		Computer computer = new Computer();
		// All actions are under facade
		// This code has not to do all related actions. 
		computer.run();
		
		return "All actions from sbsystem are called using only computer.run()";
	}
}
