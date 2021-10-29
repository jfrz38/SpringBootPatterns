package com.patterns.demo.adapter.model;

import com.patterns.demo.adapter.Basement;

public class BasementThing implements Basement {

	@Override
	public String newThing(String thing) {
		return new StringBuilder()
				.append(thing)
				.append(" added into basement")
				.toString();
	}

}
