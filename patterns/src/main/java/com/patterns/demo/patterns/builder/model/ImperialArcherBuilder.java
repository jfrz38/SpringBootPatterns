package com.patterns.demo.patterns.builder.model;

import com.patterns.demo.patterns.builder.UpgradesArcherBuilder;

public class ImperialArcherBuilder implements UpgradesArcherBuilder {

	private Archer archer;
	
	public ImperialArcherBuilder() {
		this.archer = new Archer();
	}
	
	@Override
	public void canResearchPaddedArmor() {
		archer.setCanResearchPaddedArmor(true);
	}
	
	@Override
	public void canResearchLeatherArmor() {
		archer.setCanResearchLeatherArmor(true);
	}
	
	@Override
	public void canResearchRingArmor() {
		archer.setCanResearchRingArmor(true);
	}
	
	@Override
	public void canResearchFletching() {
		archer.setCanResearchFletching(true);
	}
	
	@Override
	public void canResearchBodkingArrow() {
		archer.setCanResearchBodkinArrow(true);
	}
	
	@Override
	public void canResearchBracer() {
		archer.setCanResearchBracer(true);
	}

	@Override
	public void canResearchArcher() {
		archer.setCanResearchArcher(true);
	}
	
	@Override
	public void canResearchCrossbow() {
		archer.setCanResearchCrossbowman(true);
	}
	
	@Override
	public void canResearchArbalest() {
		archer.setCanResearchArbalest(true);
	}

	@Override
	public Archer getArcher() {
		return this.archer;
	}
	
	public String toString() {
		return new StringBuilder()
				.append("Imperial Archer = ")
				.append(this.archer.toString())
				.toString();
	}
}
