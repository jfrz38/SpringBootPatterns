package com.patterns.demo.patterns.singleton;

public class SingletonSynchronized {
	
	private static SingletonSynchronized singleton = null;
	
	private SingletonSynchronized() {
		
	}
	
	public synchronized static SingletonSynchronized getInstance() {
		return singleton == null ? singleton = new SingletonSynchronized() : singleton;
	}
}
