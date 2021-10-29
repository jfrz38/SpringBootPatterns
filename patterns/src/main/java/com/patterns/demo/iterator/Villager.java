package com.patterns.demo.iterator;

import java.util.Map;

public class Villager {

	private int id;
	private Map<String, Integer> resource;
	
	public Villager(int id, String resource, int quantity) {
		this.id = id;
		this.resource = Map.of(resource, quantity);
	}

	public int getId() {
		return id;
	}

	public void setId(int hp) {
		this.id = hp;
	}

	public Map<String, Integer> getResource() {
		return resource;
	}

	public void setResource(Map<String, Integer> resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return "Villager [id=" + id + ", resource=" + resource + "]";
	}
	
}
