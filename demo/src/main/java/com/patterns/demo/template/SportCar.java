package com.patterns.demo.template;

public class SportCar extends CarTemplate {

	public SportCar() {
		super();
	}
	
	@Override
	public void fixChasis() {
		this.chasis = "Sporty chasis";
	}

	@Override
	public void fixBody() {
		this.body = "Sporty body";
	}

	@Override
	public void paint() {
		this.paint = "Sporty White paint";
	}

	@Override
	public void fixInterior() {
		this.interior = "Sporty interior";
	}
	
	@Override
	public String toString() {
		return "SportCar: {" + super.toString()+"}";
	}
	
}