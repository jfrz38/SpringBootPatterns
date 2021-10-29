package com.patterns.demo.patterns.prototype.model;

import com.patterns.demo.patterns.prototype.VehiclePrototype;

public class CarPrototype extends VehiclePrototype{

	@Override
	public String getType() {
		return "This is the car object";
	}

}
