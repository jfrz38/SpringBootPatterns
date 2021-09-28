package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.Unit;
import com.patterns.demo.abstractfactory.model.tier.FirstTier;
import com.patterns.demo.abstractfactory.model.tier.SecondTier;
import com.patterns.demo.abstractfactory.model.tier.ThirdTier;

public class ArcheryFactory extends BuildingFactory {

	@Override
	public Unit addUnit(int type) {
		Unit unit;
		UnitFactory archeryFactory = new ArcheryUnitFactory();
		switch(type) {
		case 1:
			unit = new FirstTier(archeryFactory);
			break;
		case 2:
			unit = new SecondTier(archeryFactory);
			break;
		case 3:
			unit = new ThirdTier(archeryFactory);
			break;
		default: throw new IllegalArgumentException("No such tier.");
		}
		
		unit.addUnits();
		return unit;
	}

}
