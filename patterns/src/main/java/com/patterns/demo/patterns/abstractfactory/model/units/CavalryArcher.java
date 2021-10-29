package com.patterns.demo.patterns.abstractfactory.model.units;

import com.patterns.demo.patterns.abstractfactory.ThirdUnit;

public class CavalryArcher implements ThirdUnit {

	private double hitPoints = 50;
	private double attack = 6;
	private double meleeArmor = 0;
	private double pierceArmor = 0;
	
	public CavalryArcher() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Cavalry Archer [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor
				+ ", pierceArmor=" + pierceArmor + "]";
	}
	
}
