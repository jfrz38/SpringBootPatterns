package com.patterns.demo.patterns.singleton;

public class InnerClassSingleton {

	private static class SingletonHolder{
		public static InnerClassSingleton singleton = new InnerClassSingleton();
	}
	
	private InnerClassSingleton() {
		
	}
	
	public static InnerClassSingleton getInstance() {
		return SingletonHolder.singleton;
	}
}
