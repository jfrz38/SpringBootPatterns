package com.patterns.demo.patterns.abstractfactory.model.tier;

import com.patterns.demo.patterns.abstractfactory.Unit;
import com.patterns.demo.patterns.abstractfactory.factory.UnitFactory;

public class FirstTier implements Unit {

	UnitFactory unitFactory;
	
	public FirstTier(UnitFactory unitFactory) {
		this.unitFactory = unitFactory;
	}

	@Override
	public void addUnits() {
		unitFactory.createFirstUnit();
	}

}
