package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.FirstUnit;
import com.patterns.demo.abstractfactory.SecondUnit;
import com.patterns.demo.abstractfactory.ThirdUnit;
import com.patterns.demo.abstractfactory.model.units.Archer;
import com.patterns.demo.abstractfactory.model.units.CavalryArcher;
import com.patterns.demo.abstractfactory.model.units.Skirmisher;

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
