package com.patterns.demo.bridge;

public class Pedals implements Power {

	@Override
	public String getWorker() {
		return "User";
	}

}