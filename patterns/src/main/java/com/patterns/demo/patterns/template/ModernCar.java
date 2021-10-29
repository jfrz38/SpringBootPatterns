package com.patterns.demo.patterns.template;

public class ModernCar extends CarTemplate {

	public ModernCar() {
		super();
	}
	
	@Override
	public void fixChasis() {
		this.chasis = "Modern chasis";
	}

	@Override
	public void fixBody() {
		this.body = "Modern body";
	}

	@Override
	public void paint() {
		this.paint = "Modern White paint";
	}

	@Override
	public void fixInterior() {
		this.interior = "Modern interior";
	}
	
	@Override
	public String toString() {
		return "ModernCar: {" + super.toString()+"}";
	}
	
}