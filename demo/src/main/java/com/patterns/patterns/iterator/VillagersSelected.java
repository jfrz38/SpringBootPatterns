package com.patterns.demo.iterator;

public class VillagersSelected {

	private Villager[]villagers = new Villager[5];
    private int index;
     
    public void addVillager(String name, int quantity){
        int i = index++;
        villagers[i] = new Villager(i, name, quantity);
    }
     
    public Villager[] getVillagers(){
        return villagers;
    }
}
