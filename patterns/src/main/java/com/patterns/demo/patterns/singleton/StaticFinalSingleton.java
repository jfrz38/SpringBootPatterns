package com.patterns.demo.patterns.singleton;

public class StaticFinalSingleton {

	private static final StaticFinalSingleton singleton = new StaticFinalSingleton();
	
	private StaticFinalSingleton() {
		
	}
	
	public static StaticFinalSingleton getInstance() {
		return singleton;
	}
}
