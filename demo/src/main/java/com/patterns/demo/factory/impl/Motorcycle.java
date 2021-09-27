package com.patterns.demo.factory.impl;

import org.springframework.stereotype.Component;

import com.patterns.demo.factory.Vehicle;

@Component
public class Motorcycle implements Vehicle {

	private int nWheels = 2;
	
	public Motorcycle() {
		
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
		return "Motorcycle";
	}
}
