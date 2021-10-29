package com.patterns.demo.patterns.prototype.model;

import com.patterns.demo.patterns.prototype.VehiclePrototype;

public class BusPrototype extends VehiclePrototype{

	@Override
	public String getType() {
		return "This is the bus object";
	}

}
