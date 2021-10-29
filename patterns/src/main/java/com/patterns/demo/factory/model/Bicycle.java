package com.patterns.demo.factory.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.factory.Vehicle;


@Component
public class Bicycle implements Vehicle {

	private int nWheels = 2;
	
	public Bicycle() {
		
	}
	
	@Override
	public String specification() {
		return new StringBuilder()
				.append("This is the Bicycle vehicle with ")
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
		return "Bycicle";
	}

}
