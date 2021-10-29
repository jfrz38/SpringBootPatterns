package com.patterns.demo.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class GarageComposite extends VehicleElement {

	private List<VehicleElement> elements = new ArrayList<VehicleElement>();
	
	public GarageComposite(String name) {
		super(name);
	}
	
	@Override
	public void add(VehicleElement vehicleElement) {
		elements.add(vehicleElement);
	}

	@Override
	public void remove(VehicleElement vehicleElement) {
		elements.remove(vehicleElement);
	}

	@Override
	public String display() {
		StringBuilder str = new StringBuilder()
				.append(name)
				.append(System.lineSeparator());
		elements.forEach((VehicleElement element)->{
			str.append(element.display());
			str.append(System.lineSeparator());
		});
		str.append(System.lineSeparator());
		return str.toString();
		
	}
}
