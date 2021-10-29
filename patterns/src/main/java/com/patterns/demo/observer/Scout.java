package com.patterns.demo.observer;

public class Scout  implements Observer {

	int attack = 0;
	int defense = 0;
	
	public void update(int attack, int defense) {
		this.attack += attack;
		this.defense += defense;
        System.out.println("Updated scout-line. Attack = "+ attack + " defense = "+defense);
    }

}
