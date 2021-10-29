package com.patterns.demo.patterns.abstractfactory.model.units;

import com.patterns.demo.patterns.abstractfactory.ThirdUnit;

public class Elephant implements ThirdUnit {

	private double hitPoints = 100;
	private double attack = 10;
	private double meleeArmor = 2;
	private double pierceArmor = 2;
	
	public Elephant() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Elephant [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor
				+ ", pierceArmor=" + pierceArmor + "]";
	}

}
