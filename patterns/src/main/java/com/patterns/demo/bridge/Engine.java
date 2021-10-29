package com.patterns.demo.bridge;

public class Engine implements Power {

	@Override
	public String getWorker() {
		return "Fuel";
	}

}
