package com.patterns.demo.builder;

import com.patterns.demo.builder.model.Archer;

public interface UpgradesArcherBuilder {

	public void canResearchPaddedArmor();
	
	public void canResearchLeatherArmor();
	
	public void canResearchRingArmor();

	public void canResearchFletching();
	
	public void canResearchBodkingArrow();
	
	public void canResearchBracer();
	
	public void canResearchArcher();
	
	public void canResearchCrossbow();
	
	public void canResearchArbalest();
	
	public Archer getArcher();
	
}
