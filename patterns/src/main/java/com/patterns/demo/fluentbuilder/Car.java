package com.patterns.demo.fluentbuilder;

public class Car {

	private String color;
	private int nDoors;
	private int cvs;
	private boolean leatherSeats;
	private String model;
	
	public static class Builder{
		
		// Required values
		private static int nDoors;
		private static int cvs;
		private static String model;
		
		// Default values
		private static String color = "Black";
		private static boolean leatherSeats = false;
		
		public Builder() {

		}
		
		public Builder doors(int value) {
			nDoors = value;
			return this;
		}
		
		public Builder cvs(int value) {
			cvs = value;
			return this;
		}
		
		public Builder model(String value) {
			model = value;
			return this;
		}
		
		public Builder color(String value) {
			color = value;
			return this;
		}
		
		public Builder seats(boolean value) {
			leatherSeats = value;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
	private Car(Builder builder) {
		color = Builder.color;
		nDoors = Builder.nDoors;
		cvs = Builder.cvs;
		leatherSeats = Builder.leatherSeats;
		model = Builder.model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getnDoors() {
		return nDoors;
	}

	public void setnDoors(int nDoors) {
		this.nDoors = nDoors;
	}

	public int getCvs() {
		return cvs;
	}

	public void setCvs(int cvs) {
		this.cvs = cvs;
	}

	public boolean isLeatherSeats() {
		return leatherSeats;
	}

	public void setLeatherSeats(boolean leatherSeats) {
		this.leatherSeats = leatherSeats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", nDoors=" + nDoors + ", cvs=" + cvs + ", leatherSeats=" + leatherSeats
				+ ", model=" + model + "]";
	}
	
}
