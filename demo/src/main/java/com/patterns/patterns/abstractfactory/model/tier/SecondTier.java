package com.patterns.demo.abstractfactory.model.tier;

import com.patterns.demo.abstractfactory.Unit;
import com.patterns.demo.abstractfactory.factory.UnitFactory;

public class SecondTier implements Unit {

	UnitFactory unitFactory;
	
	public SecondTier(UnitFactory unitFactory) {
		this.unitFactory = unitFactory;
	}

	@Override
	public void addUnits() {
		unitFactory.createSecondUnit();
	}

}
