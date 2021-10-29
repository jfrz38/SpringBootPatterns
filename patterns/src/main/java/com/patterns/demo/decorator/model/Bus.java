package com.patterns.demo.decorator.model;

import org.springframework.stereotype.Component;

import com.patterns.demo.decorator.Garage;

@Component("BusDecorator")
public class Bus implements Garage{

	@Override
	public String getGarage() {
		return "autobús";
	}

}
