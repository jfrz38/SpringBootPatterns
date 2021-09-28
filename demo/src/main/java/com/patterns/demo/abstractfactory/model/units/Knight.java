package com.patterns.demo.abstractfactory.model.units;

import com.patterns.demo.abstractfactory.SecondUnit;

public class Knight implements SecondUnit {

	private double hitPoints = 100;
	private double attack = 10;
	private double meleeArmor = 2;
	private double pierceArmor = 2;
	
	public Knight() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Knight [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor + ", pierceArmor="
				+ pierceArmor + "]";
	}

	
}
