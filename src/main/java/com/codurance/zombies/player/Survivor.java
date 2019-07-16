package com.codurance.zombies.player;

import com.codurance.zombies.equipment.Equipment;

import java.util.LinkedList;

public class Survivor {
    private int turns;
    private int wounds;
    private String name;
    private LinkedList<Equipment> backpack;
    private LinkedList<Equipment> elementsInHand;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.turns = 3;
        this.backpack = new LinkedList<Equipment>();
        this.elementsInHand = new LinkedList<Equipment>();
    }

    public int getWounds() {
        return this.wounds;
    }

    public void wound() {
        if (isAlive()) {
            this.wounds ++;
        }
    }

    public boolean isAlive() {
        return this.wounds < 2;
    }

    public int getTurns() {
        return this.turns;
    }

    public void pickUpEquipment(Equipment equipment) {
        this.backpack.add(equipment);
    }

    public int getNumEquipments() {
        return this.backpack.size();
    }
;
    public void useEquipmentInHand(Equipment equipment) {
        this.elementsInHand.add(equipment);
    }

    public int getElementsInHand() {
        return this.elementsInHand.size();
    }
}
