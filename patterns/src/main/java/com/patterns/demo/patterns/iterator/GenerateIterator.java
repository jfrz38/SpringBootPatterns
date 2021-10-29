package com.patterns.demo.patterns.iterator;

public class GenerateIterator {

	public GenerateIterator() {
		
	}
	
	public String generate() {
		VillagersSelected villagers = new VillagersSelected();
		villagers.addVillager("Wood", 10);
		villagers.addVillager("Food", 12);
		villagers.addVillager("Gold", 8);
		villagers.addVillager("Stone", 0);
		
		VillagerIterator iterator = new VillagerIterator(villagers.getVillagers());
		StringBuilder stringBuilder = new StringBuilder();
		while(iterator.hasNext()) {
			stringBuilder
				.append(iterator.next())
				.append(System.lineSeparator());
		}
		
		return stringBuilder.toString();
        
	}
}
