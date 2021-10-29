package com.patterns.demo.prototype;

public abstract class VehiclePrototype implements Cloneable {

	public abstract String getType();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException e) {
			//
		}
		return clone;
	}
}
