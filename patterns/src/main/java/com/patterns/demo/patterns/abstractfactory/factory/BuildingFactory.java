package com.patterns.demo.patterns.abstractfactory.factory;

import com.patterns.demo.patterns.abstractfactory.Unit;

public abstract class BuildingFactory {

	public abstract Unit addUnit(int type);
}
