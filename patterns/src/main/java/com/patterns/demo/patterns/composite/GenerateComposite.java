package com.patterns.demo.patterns.composite;

public class GenerateComposite {

	public GenerateComposite() {

	}
	
	public String createGarage() {

		// Create Garage1
		GarageComposite garage1 = new GarageComposite("Garage 1");
		garage1.add(new VehicleComposite("Car"));
		garage1.add(new VehicleComposite("Bicycle"));

		// Create Garage2
		GarageComposite garage2 = new GarageComposite("Garage2");
		garage2.add(new VehicleComposite("Bus"));
		garage2.add(new VehicleComposite("Motorbike"));
		garage2.add(new VehicleComposite("Car"));
		
		garage1.add(garage2);

		// Add scooter vehicle
		VehicleComposite vehicle = new VehicleComposite("Scooter");
		garage1.add(vehicle);
		// Remove scooter vehicle
		garage1.remove(vehicle);
		
		return garage1.display();
	}
}
