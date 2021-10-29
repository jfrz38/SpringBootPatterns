package com.patterns.demo.singleton;

public class SingletonGenerator {

	public SingletonGenerator() {
		
	}
	
	public String generate() {
		return new StringBuilder()
				.append("Traditional: ")
				.append(SingletonTraditional.getInstance() == SingletonTraditional.getInstance())
				.append(System.lineSeparator())
				.append("Synchronized: ")
				.append(SingletonSynchronized.getInstance() == SingletonSynchronized.getInstance())
				.append(System.lineSeparator())
				.append("Static final: ")
				.append(StaticFinalSingleton.getInstance() == StaticFinalSingleton.getInstance())
				.append(System.lineSeparator())
				.append("Inner: ")
				.append(InnerClassSingleton.getInstance() == InnerClassSingleton.getInstance())
				.append(System.lineSeparator())
				.append("Enum: ")
				.append(EnumSingleton.SINGLETON == EnumSingleton.SINGLETON)
				.toString();
	}
}
