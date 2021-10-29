package com.patterns.demo.patterns.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleFactoryImplementation {

	private static final Map<String, Vehicle> factoryMap = new HashMap<>();
	
	@Autowired
    public void initFactory(List<Vehicle> vehicles) {
		vehicles.forEach((Vehicle vehicle) ->{
			factoryMap.put(vehicle.getType(), vehicle);
		});
    }
	
	public static Vehicle createInstance(String vehicle) throws Exception{
		return Optional.ofNullable(factoryMap.get(vehicle)).orElseThrow(() -> new IllegalArgumentException("Invalid vehicle"));
	}
}
