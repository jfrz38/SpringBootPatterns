package com.patterns.demo.observer;

public class Militia implements Observer {

	int attack = 0;
	int defense = 0;
	
	public void update(int attack, int defense) {
		this.attack += attack;
		this.defense += defense;
        System.out.println("Updated militia-line. Attack = "+ attack + " defense = "+defense);
    }

}