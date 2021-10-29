package com.patterns.demo.patterns.bridge;

public class BicycleBridge implements VehicleEngine {

	private final Power power;
	
	public BicycleBridge(Power power) {
		this.power = power;
	}
	@Override
	public String powerOn() {
		return new StringBuilder()
				.append("Bicycle power on by ")
				.append(power.getWorker())
				.toString();
	}

}
