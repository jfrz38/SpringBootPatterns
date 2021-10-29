package com.patterns.demo.prototype.model;

import com.patterns.demo.prototype.VehiclePrototype;

public class GeneratePrototype {

	public GeneratePrototype() {

	}
	
	public String generate() {
		StringBuilder str = new StringBuilder();
		VehiclePrototype car = (VehiclePrototype) VehicleCache.vehicleCacheMap.get("CAR").clone();
		VehiclePrototype bus = (VehiclePrototype)VehicleCache.vehicleCacheMap.get("BUS") .clone();
		str.append(car.getType())
		.append(System.lineSeparator())
		.append(bus.getType());
		
		return str.toString();
	}
}
