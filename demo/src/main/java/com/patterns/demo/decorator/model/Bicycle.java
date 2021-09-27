package com.patterns.demo.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.decorator.Garage;

@Component("BicycleDecorator")
public class Bicycle implements Garage {

	@Override
	public String getGarage() {
		return "bicicleta";
	}

}
