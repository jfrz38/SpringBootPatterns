package com.patterns.demo.patterns.proxy.model;

import com.patterns.demo.patterns.proxy.VehicleSound;

public class VehicleSoundImpl implements VehicleSound {
	
	public VehicleSoundImpl() {
		System.out.println("Arrancando motor");
	}
	
	@Override
	public String makeSound() {
		return "breeem breeem";
	}

}
