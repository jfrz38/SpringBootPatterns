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
		return "This is the Bycicle vehicle with "+getnWheels()+" wheels";
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
