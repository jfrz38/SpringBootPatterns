package com.patterns.demo.patterns.bridge;

public class Engine implements Power {

	@Override
	public String getWorker() {
		return "Fuel";
	}

}
