package com.patterns.demo.patterns.abstractfactory.factory;

import com.patterns.demo.patterns.abstractfactory.FirstUnit;
import com.patterns.demo.patterns.abstractfactory.SecondUnit;
import com.patterns.demo.patterns.abstractfactory.ThirdUnit;
import com.patterns.demo.patterns.abstractfactory.model.units.Archer;
import com.patterns.demo.patterns.abstractfactory.model.units.CavalryArcher;
import com.patterns.demo.patterns.abstractfactory.model.units.Skirmisher;

public class ArcheryUnitFactory extends UnitFactory {

	@Override
	public FirstUnit createFirstUnit() {
		return new Archer();
	}

	@Override
	public SecondUnit createSecondUnit() {
		return new Skirmisher();
	}

	@Override
	public ThirdUnit createThirdUnit() {
		return new CavalryArcher();
	}

}
