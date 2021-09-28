package com.patterns.demo.bridge;

public class CarBridge implements VehicleEngine{

	private final Power power;
	
	public CarBridge(Power power) {
		this.power = power;
	}

	@Override
	public String powerOn() {
		return new StringBuilder()
				.append("Car power on by ")
				.append(power.getWorker())
				.toString();
	}
	
}
