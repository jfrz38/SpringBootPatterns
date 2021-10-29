package com.patterns.demo.abstractfactory.factory;

import com.patterns.demo.abstractfactory.Unit;

public abstract class BuildingFactory {

	public abstract Unit addUnit(int type);
}
