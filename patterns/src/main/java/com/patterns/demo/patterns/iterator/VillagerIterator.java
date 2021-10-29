package com.patterns.demo.patterns.iterator;

import java.util.Iterator;

public class VillagerIterator implements Iterator<Villager> {

	private Villager[] villagers;
	int position;
	
	public VillagerIterator(Villager[] villagers) {
		this.villagers = villagers;
	}
	
	@Override
	public boolean hasNext() {
		return (position >= villagers.length || villagers[position] == null) ? false : true;
	
	}
	
	@Override 
	public Villager next() {
		return villagers[position++];
	}
	
}
