package com.patterns.demo.patterns.prototype.model;

import java.util.HashMap;
import java.util.Map;

import com.patterns.demo.patterns.prototype.VehiclePrototype;

public class VehicleCache {

	public static Map<String, VehiclePrototype> vehicleCacheMap = new HashMap<String, VehiclePrototype>();
	
	static {
		vehicleCacheMap = Map.of(
				"CAR", new CarPrototype(),
				"BUS", new BusPrototype());
	}
}
