package com.patterns.demo.abstractfactory.model.units;

import com.patterns.demo.abstractfactory.FirstUnit;

public class Archer implements FirstUnit {

	private double hitPoints = 30;
	private double attack = 4;
	private double meleeArmor = 0;
	private double pierceArmor = 0;
	
	public Archer() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());

	}
	
	@Override
	public String toString() {
		return "Archer [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor + ", pierceArmor="
				+ pierceArmor + "]";
	}

}
