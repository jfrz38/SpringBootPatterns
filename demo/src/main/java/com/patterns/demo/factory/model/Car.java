package com.patterns.demo.factory.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.factory.Vehicle;

@Component
public class Car implements Vehicle {

	private int nWheels = 4;
	
	public Car() {
		
	}
	
	@Override
	public String specification() {
		return "This is the Motorcycle vehicle with "+getnWheels()+" wheels";
	}

	public int getnWheels() {
		return nWheels;
	}

	public void setnWheels(int nWheels) {
		this.nWheels = nWheels;
	}
	
	@Override
	public String getType() {
		return "Car";
	}
}
