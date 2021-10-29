package com.patterns.demo.patterns.proxy.model;

import com.patterns.demo.patterns.proxy.VehicleSound;

public class VehicleSoundProxy implements VehicleSound {

	private static VehicleSound sound;
	
	@Override
	public String makeSound() {
		if(sound == null) {
			sound = new VehicleSoundImpl();
			return sound.makeSound();
		}
		return sound.makeSound();
	}

}
