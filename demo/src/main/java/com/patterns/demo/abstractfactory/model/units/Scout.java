package com.patterns.demo.abstractfactory.model.units;

import com.patterns.demo.abstractfactory.FirstUnit;

public class Scout implements FirstUnit {

	private double hitPoints = 45;
	private double attack = 3;
	private double meleeArmor = 0;
	private double pierceArmor = 2;
	
	public Scout() {
		trainUnit();
	}
	
	@Override
	public void trainUnit() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Scout [hitPoints=" + hitPoints + ", attack=" + attack + ", meleeArmor=" + meleeArmor + ", pierceArmor="
				+ pierceArmor + "]";
	}
	
	

}
