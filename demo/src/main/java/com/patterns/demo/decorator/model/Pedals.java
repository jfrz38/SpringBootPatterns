package com.patterns.demo.decorator.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patterns.demo.decorator.Garage;

@Component("pedals")
public class Pedals implements Garage {

	@Autowired
	Bicycle bicycle;
	
	@Override
	public String getGarage() {
		return new StringBuilder()
				.append(bicycle.getGarage())
				.append(" con pedales")
				.toString();
	}

}
