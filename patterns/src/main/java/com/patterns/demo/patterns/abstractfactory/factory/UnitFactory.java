package com.patterns.demo.patterns.abstractfactory.factory;

import com.patterns.demo.patterns.abstractfactory.FirstUnit;
import com.patterns.demo.patterns.abstractfactory.SecondUnit;
import com.patterns.demo.patterns.abstractfactory.ThirdUnit;

public abstract class UnitFactory {
	
	public abstract FirstUnit createFirstUnit();
	public abstract SecondUnit createSecondUnit();
	public abstract ThirdUnit createThirdUnit();
	
}
