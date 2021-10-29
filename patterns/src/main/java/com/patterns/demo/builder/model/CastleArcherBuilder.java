package com.patterns.demo.builder.model;

import com.patterns.demo.builder.UpgradesArcherBuilder;

public class CastleArcherBuilder implements UpgradesArcherBuilder {

	private Archer archer;
	
	public CastleArcherBuilder() {
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
		archer.setCanResearchRingArmor(false);
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
		archer.setCanResearchBracer(false);
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
		archer.setCanResearchArbalest(false);
	}

	@Override
	public Archer getArcher() {
		return this.archer;
	}
	
	public String toString() {
		return new StringBuilder()
				.append("Castle Archer = ")
				.append(this.archer.toString())
				.toString();
	}
}

