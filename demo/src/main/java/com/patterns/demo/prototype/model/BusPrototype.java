package com.patterns.demo.prototype.model;

import com.patterns.demo.prototype.VehiclePrototype;

public class BusPrototype extends VehiclePrototype{

	@Override
	public String getType() {
		return "This is the bus object";
	}

}
