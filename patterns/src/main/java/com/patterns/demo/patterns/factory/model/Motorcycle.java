package com.patterns.demo.patterns.factory.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.patterns.factory.Vehicle;

@Component
public class Motorcycle implements Vehicle {

	private int nWheels = 2;
	
	public Motorcycle() {
		
	}
	
	@Override
	public String specification() {
		return new StringBuilder()
				.append("This is the Motorcycle vehicle with ")
				.append(getnWheels())
				.append(" wheels")
				.toString();
	}

	public int getnWheels() {
		return nWheels;
	}

	public void setnWheels(int nWheels) {
		this.nWheels = nWheels;
	}

	@Override
	public String getType() {
		return "Motorcycle";
	}
}
