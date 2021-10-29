package com.patterns.demo.observer;

public class Cavalry  implements Observer {

	int attack = 0;
	int defense = 0;
	
	public void update(int attack, int defense) {
        System.out.println("Updated cavalry-line. Attack = "+ attack + " defense = "+defense);
    }

}
