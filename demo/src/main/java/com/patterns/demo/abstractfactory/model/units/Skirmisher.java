package com.patterns.demo.abstractfactory.model.units;

import com.patterns.demo.abstractfactory.SecondUnit;

public class Skirmisher implements SecondUnit {

	private double hitPoints = 30;
	private double attack = 2;
	private double meleeArmor = 0;
	private double pierceArmor = 3;
	
	public Skirmisher() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());

	}
	
	@Override
	public String toString() {
		return "Skirmisher [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor
				+ ", pierceArmor=" + pierceArmor + "]";
	}

}
