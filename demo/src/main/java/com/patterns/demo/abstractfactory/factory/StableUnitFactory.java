package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.FirstUnit;
import com.patterns.demo.abstractfactory.SecondUnit;
import com.patterns.demo.abstractfactory.ThirdUnit;
import com.patterns.demo.abstractfactory.model.units.Elephant;
import com.patterns.demo.abstractfactory.model.units.Knight;
import com.patterns.demo.abstractfactory.model.units.Scout;

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
