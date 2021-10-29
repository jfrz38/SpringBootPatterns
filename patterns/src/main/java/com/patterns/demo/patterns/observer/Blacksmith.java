package com.patterns.demo.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Blacksmith implements Subject {

	private final List<Observer> observers;
    private int attack;
    private int defense;

    public Blacksmith() {
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
        for (Observer o : observers) {
            o.update(attack, defense);
        }
    }

    public void valuesChanged() {
        notifyObservers();
    }

    public void setValues(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
        valuesChanged();
    }


}
