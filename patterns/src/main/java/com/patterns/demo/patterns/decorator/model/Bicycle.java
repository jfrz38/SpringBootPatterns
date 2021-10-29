package com.patterns.demo.patterns.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.patterns.decorator.Garage;

@Component("BicycleDecorator")
public class Bicycle implements Garage {

	@Override
	public String getGarage() {
		return "bicicleta";
	}

}
