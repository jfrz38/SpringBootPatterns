package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.Unit;
import com.patterns.demo.abstractfactory.model.tier.FirstTier;
import com.patterns.demo.abstractfactory.model.tier.SecondTier;
import com.patterns.demo.abstractfactory.model.tier.ThirdTier;

public class StableFactory extends BuildingFactory {

	@Override
	public Unit addUnit(int type) {
		Unit unit;
		UnitFactory stableFactory = new StableUnitFactory();
		switch(type) {
		case 1:
			unit = new FirstTier(stableFactory);
			break;
		case 2:
			unit = new SecondTier(stableFactory);
			break;
		case 3:
			unit = new ThirdTier(stableFactory);
			break;
		default: throw new IllegalArgumentException("No such tier.");
		}
		
		unit.addUnits();
		return unit;
	}

}
