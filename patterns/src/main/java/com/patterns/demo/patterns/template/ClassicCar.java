package com.patterns.demo.patterns.template;

public class ClassicCar extends CarTemplate {

	public ClassicCar() {
		super();
	}
	
	@Override
	public void fixChasis() {
		this.chasis = "Classic chasis";
	}

	@Override
	public void fixBody() {
		this.body = "Classic body";
	}

	@Override
	public void paint() {
		this.paint = "Classic White paint";
	}

	@Override
	public void fixInterior() {
		this.interior = "Classic interior";
	}
	
	@Override
	public String toString() {
		return "ClassicCar: {" + super.toString()+"}";
	}
	
}
