package com.patterns.demo.builder.model;

public class Archer {

	private boolean canResearchPaddedArmor;
	private boolean canResearchLeatherArmor;
	private boolean canResearchRingArmor;
	private boolean canResearchFletching;
	private boolean canResearchBodkinArrow;
	private boolean canResearchBracer;
	private boolean canResearchArcher;
	private boolean canResearchCrossbowman;
	private boolean canResearchArbalest;
	
	public boolean getCanResearchPaddedArmor() {
		return canResearchPaddedArmor;
	}
	public void setCanResearchPaddedArmor(boolean canResearchPaddedArmor) {
		this.canResearchPaddedArmor = canResearchPaddedArmor;
	}
	public boolean getCanResearchLeatherArmor() {
		return canResearchLeatherArmor;
	}
	public void setCanResearchLeatherArmor(boolean canResearchLeatherArmor) {
		this.canResearchLeatherArmor = canResearchLeatherArmor;
	}
	public boolean getCanResearchRingArmor() {
		return canResearchRingArmor;
	}
	public void setCanResearchRingArmor(boolean canResearchRingArmor) {
		this.canResearchRingArmor = canResearchRingArmor;
	}
	public boolean getCanResearchFletching() {
		return canResearchFletching;
	}
	public void setCanResearchFletching(boolean canResearchFletching) {
		this.canResearchFletching = canResearchFletching;
	}
	public boolean getCanResearchBodkinArrow() {
		return canResearchBodkinArrow;
	}
	public void setCanResearchBodkinArrow(boolean canResearchBodkinArrow) {
		this.canResearchBodkinArrow = canResearchBodkinArrow;
	}
	public boolean getCanResearchBracer() {
		return canResearchBracer;
	}
	public void setCanResearchBracer(boolean canResearchBracer) {
		this.canResearchBracer = canResearchBracer;
	}
	public boolean getCanResearchArcher() {
		return canResearchArcher;
	}
	public void setCanResearchArcher(boolean canResearchArcher) {
		this.canResearchArcher = canResearchArcher;
	}
	public boolean getCanResearchCrossbowman() {
		return canResearchCrossbowman;
	}
	public void setCanResearchCrossbowman(boolean canResearchCrossbowman) {
		this.canResearchCrossbowman = canResearchCrossbowman;
	}
	public boolean getCanResearchArbalest() {
		return canResearchArbalest;
	}
	public void setCanResearchArbalest(boolean canResearchArbalest) {
		this.canResearchArbalest = canResearchArbalest;
	}
	@Override
	public String toString() {
		return "Archer [canResearchPaddedArmor=" + canResearchPaddedArmor + ", canResearchLeatherArmor="
				+ canResearchLeatherArmor + ", canResearchRingArmor=" + canResearchRingArmor + ", canResearchFletching="
				+ canResearchFletching + ", canResearchBodkinArrow=" + canResearchBodkinArrow + ", canResearchBracer="
				+ canResearchBracer + ", canResearchArcher=" + canResearchArcher + ", canResearchCrossbowman="
				+ canResearchCrossbowman + ", canResearchArbalest=" + canResearchArbalest + "]";
	}
	
}
