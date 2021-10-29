package com.patterns.demo.patterns.template;

public abstract class CarTemplate {

	protected String chasis;
	protected String body;
	protected String paint;
	protected String interior;
	
	public CarTemplate() {
		super();
	}
	
	public abstract void fixChasis();
	
	public abstract void fixBody();
	
	public abstract void paint();
	
	public abstract void fixInterior();
	
	// template method
	public void manufactureCar() {
		fixChasis();
		fixBody();
		paint();
		fixInterior();
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPaint() {
		return paint;
	}

	public void setPaint(String paint) {
		this.paint = paint;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "CarTemplate [chasis=" + chasis + ", body=" + body + ", paint=" + paint + ", interior=" + interior + "]";
	}
	
}
