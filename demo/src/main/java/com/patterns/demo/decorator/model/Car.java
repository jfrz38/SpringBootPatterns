package com.patterns.demo.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.decorator.Garage;

@Component("CarDecorator")
public class Car implements Garage{

	@Override
	public String getGarage() {
		return "coche";
	}

}
