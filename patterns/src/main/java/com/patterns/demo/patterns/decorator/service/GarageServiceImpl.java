package com.patterns.demo.patterns.decorator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.patterns.demo.patterns.decorator.Garage;

@Service
public class GarageServiceImpl implements GarageService{

	@Autowired
	private Garage garage;
	
	@Autowired
	@Qualifier("CarDecorator")
	private Garage car;
	
	@Autowired
	@Qualifier("BusDecorator")
	private Garage bus;
	
	@Autowired
	@Qualifier("BicycleDecorator")
	private Garage bicycle;
	
	@Autowired
	@Qualifier("pedals")
	private Garage pedals;

	@Override
	public String getGarage() {
		return new StringBuilder()
				.append(garage.getGarage())
				.append(System.getProperty("line.separator"))
				.append(car.getGarage())
				.append(System.getProperty("line.separator"))
				.append(bus.getGarage())
				.append(System.getProperty("line.separator"))
				.append(bicycle.getGarage())
				.append(System.getProperty("line.separator"))
				.append(pedals.getGarage())
				.toString();
	}


	
	
}
