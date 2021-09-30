package com.patterns.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class BlacksmithUpgrades implements Subject {

	private final List<Observer> observers;
	private int attack;
    private int defense;
	
	public BlacksmithUpgrades() {
		observers = new ArrayList<>();
	}

	public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
    	observers.forEach((Observer o) -> {
    		o.update(attack, defense);
    	});
    }
    
    public void setValues(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
        valuesChanged();
    }
    
    public void valuesChanged() {
        notifyObservers();
    }

}
