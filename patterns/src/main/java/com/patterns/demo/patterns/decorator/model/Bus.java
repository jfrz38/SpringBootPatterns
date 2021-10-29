package com.patterns.demo.patterns.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.patterns.decorator.Garage;

@Component("BusDecorator")
public class Bus implements Garage{

	@Override
	public String getGarage() {
		return "autobús";
	}

}
