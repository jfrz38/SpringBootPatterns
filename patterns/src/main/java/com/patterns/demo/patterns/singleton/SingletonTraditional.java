package com.patterns.demo.patterns.singleton;

public class SingletonTraditional {

	private static SingletonTraditional singleton = null;
	
	private SingletonTraditional() {
	
	}
	
	public static SingletonTraditional getInstance() {
		return singleton == null ? singleton = new SingletonTraditional() : singleton;
	}
}
