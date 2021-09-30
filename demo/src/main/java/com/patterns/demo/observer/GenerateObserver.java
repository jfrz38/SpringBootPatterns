package com.patterns.demo.observer;

public class GenerateObserver {

	public GenerateObserver() {
		
	}
	
	public void generate() {
		final BlacksmithUpgrades blacksmithUpgrades = new BlacksmithUpgrades();

	    final Scout scout = new Scout();
	    blacksmithUpgrades.registerObserver(scout);
	    final Cavalry cavalry = new Cavalry();
	    blacksmithUpgrades.registerObserver(cavalry);
	    final Militia militia = new Militia();
	    blacksmithUpgrades.registerObserver(militia);
	    final Pikerman pikerman = new Pikerman();
	    blacksmithUpgrades.registerObserver(pikerman);

	    for (int i = 1; i <= 3; i++) {
	    	System.out.println("Research upgrades line: "+i);
	    	blacksmithUpgrades.setValues(i,i);
	        System.out.println("***************************************");
	    }
	}
}
