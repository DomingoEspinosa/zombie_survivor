package com.codurance.zombies.player;

import com.codurance.zombies.equipment.Equipment;

import java.util.LinkedList;

public class BackPack {

    private LinkedList<Equipment> backpack;
    private LinkedList<Equipment> elementsInHand;

    public BackPack() {
        this.backpack = new LinkedList<Equipment>();
        this.elementsInHand = new LinkedList<Equipment>();
    }

    public void pickUpEquipment(Equipment equipment) {
        this.backpack.add(equipment);
    }

    public int getNumEquipments() {
        return this.backpack.size();
    }

    public void useEquipmentInHand(Equipment equipment) {
        this.elementsInHand.add(equipment);
    }

    public int getElementsInHand() {
        return this.elementsInHand.size();
    }
}
