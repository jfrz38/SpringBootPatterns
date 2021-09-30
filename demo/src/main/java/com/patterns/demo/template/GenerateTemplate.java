package com.patterns.demo.template;

public class GenerateTemplate {

	public GenerateTemplate() {
		
	}
	
	public String generate() {
		String carData = "";
		CarTemplate sportCar = new SportCar();
		sportCar.manufactureCar();
		carData += sportCar + " ";
		CarTemplate classicCar = new ClassicCar();
		classicCar.manufactureCar();
		carData += classicCar;
		CarTemplate modernCar = new ModernCar();
		modernCar.manufactureCar();
		carData += modernCar;
		return carData;
	}
}
