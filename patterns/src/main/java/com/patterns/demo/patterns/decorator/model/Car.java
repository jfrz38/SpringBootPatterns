package com.patterns.demo.patterns.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.patterns.decorator.Garage;

@Component("CarDecorator")
public class Car implements Garage{

	@Override
	public String getGarage() {
		return "coche";
	}

}
