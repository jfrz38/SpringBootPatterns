package com.patterns.demo.patterns.composite;

public class VehicleComposite extends VehicleElement {

	public VehicleComposite(String name) {
		super(name);
	}

	@Override
	public void add(VehicleElement vehicleElement) {
		System.out.println("Cannot add to a PrimitiveElement");
	}

	@Override
	public void remove(VehicleElement vehicleElement) {
		System.out.println("Cannot remove from a PrimitiveElement");
	}

	@Override
	public String display() {
		return new StringBuilder().append("->").append(name).toString();
	}
	
}
