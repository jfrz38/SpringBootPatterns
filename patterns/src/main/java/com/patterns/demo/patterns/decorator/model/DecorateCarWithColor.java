package com.patterns.demo.patterns.decorator.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.patterns.demo.patterns.decorator.Garage;

@Component
@Primary
public class DecorateCarWithColor implements Garage {

	@Autowired
	@Qualifier("CarDecorator")
	Garage garage;
	
	@Override
	public String getGarage() {
		return new StringBuilder()
				.append(garage.getGarage())
				.append(" amarillo")
				.toString();
	}
}
