package com.patterns.demo.composite;

public abstract class VehicleElement {

	protected String name;
	
	public VehicleElement(String name) {
		this.name = name;
	}
	
	public abstract void add(VehicleElement vehicleElement);
	
	public abstract void remove(VehicleElement vehicleElement);
	
	public abstract String display();
}
