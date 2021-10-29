package com.patterns.demo.patterns.bridge;

public class Pedals implements Power {

	@Override
	public String getWorker() {
		return "User";
	}

}