package com.patterns.demo.patterns.abstractfactory.factory;

import com.patterns.demo.patterns.abstractfactory.FirstUnit;
import com.patterns.demo.patterns.abstractfactory.SecondUnit;
import com.patterns.demo.patterns.abstractfactory.ThirdUnit;
import com.patterns.demo.patterns.abstractfactory.model.units.Elephant;
import com.patterns.demo.patterns.abstractfactory.model.units.Knight;
import com.patterns.demo.patterns.abstractfactory.model.units.Scout;

public class StableUnitFactory extends UnitFactory {

	@Override
	public FirstUnit createFirstUnit() {
		return new Scout();
	}

	@Override
	public SecondUnit createSecondUnit() {
		return new Knight();
	}

	@Override
	public ThirdUnit createThirdUnit() {
		return new Elephant();
	}

}
