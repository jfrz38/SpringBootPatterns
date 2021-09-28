package com.patterns.demo.proxy.model;

import com.patterns.demo.proxy.VehicleSound;

public class VehicleSoundImpl implements VehicleSound {
	
	public VehicleSoundImpl() {
		System.out.println("Arrancando motor");
	}
	
	@Override
	public String makeSound() {
		return "breeem breeem";
	}

}
