package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.FirstUnit;
import com.patterns.demo.abstractfactory.SecondUnit;
import com.patterns.demo.abstractfactory.ThirdUnit;

public abstract class UnitFactory {
	
	public abstract FirstUnit createFirstUnit();
	public abstract SecondUnit createSecondUnit();
	public abstract ThirdUnit createThirdUnit();
	
}
