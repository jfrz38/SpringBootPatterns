package com.patterns.demo.patterns.abstractfactory.model;

import com.patterns.demo.patterns.abstractfactory.factory.ArcheryFactory;
import com.patterns.demo.patterns.abstractfactory.factory.BuildingFactory;
import com.patterns.demo.patterns.abstractfactory.factory.StableFactory;

public class GenerateAbstractFactory {

	public GenerateAbstractFactory() {
		
	}
	
	public void generate(String building, int type) {

        switch(building.toLowerCase()) {
        case "stable": 
        	BuildingFactory stable = new StableFactory();
        	stable.addUnit(type).toString();
        	break;
        case "archery":
        	BuildingFactory archery = new ArcheryFactory();
        	archery.addUnit(type).toString();
        	break;
        default: throw new IllegalArgumentException("No such building.");
        }
	}
}
