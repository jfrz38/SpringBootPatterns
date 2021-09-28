package com.patterns.demo.prototype.model;

import com.patterns.demo.prototype.VehiclePrototype;

public class CarPrototype extends VehiclePrototype{

	@Override
	public String getType() {
		return "This is the car object";
	}

}
