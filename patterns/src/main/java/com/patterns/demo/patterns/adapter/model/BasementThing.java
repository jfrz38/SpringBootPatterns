package com.patterns.demo.patterns.adapter.model;

import com.patterns.demo.patterns.adapter.Basement;

public class BasementThing implements Basement {

	@Override
	public String newThing(String thing) {
		return new StringBuilder()
				.append(thing)
				.append(" added into basement")
				.toString();
	}

}
