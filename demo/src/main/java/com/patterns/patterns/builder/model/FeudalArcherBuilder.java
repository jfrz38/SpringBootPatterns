package com.patterns.demo.builder.model;

import com.patterns.demo.builder.UpgradesArcherBuilder;

public class FeudalArcherBuilder implements UpgradesArcherBuilder {

	private Archer archer;
	
	public FeudalArcherBuilder() {
		this.archer = new Archer();
	}
	
	@Override
	public void canResearchPaddedArmor() {
		archer.setCanResearchPaddedArmor(true);
	}
	
	@Override
	public void canResearchLeatherArmor() {
		archer.setCanResearchLeatherArmor(false);
	}
	
	@Override
	public void canResearchRingArmor() {
		archer.setCanResearchRingArmor(false);
	}
	
	@Override
	public void canResearchFletching() {
		archer.setCanResearchFletching(true);
	}
	
	@Override
	public void canResearchBodkingArrow() {
		archer.setCanResearchBodkinArrow(false);
	}
	
	@Override
	public void canResearchBracer() {
		archer.setCanResearchBracer(false);
	}

	@Override
	public void canResearchArcher() {
		archer.setCanResearchArcher(true);
	}
	
	@Override
	public void canResearchCrossbow() {
		archer.setCanResearchCrossbowman(false);
	}
	
	@Override
	public void canResearchArbalest() {
		archer.setCanResearchArbalest(false);
	}

	@Override
	public Archer getArcher() {
		return this.archer;
	}
	
	public String toString() {
		return new StringBuilder()
				.append("Feudal Archer = ")
				.append(this.archer.toString())
				.toString();
	}
	
}
