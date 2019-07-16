package com.codurance.zombies.player;

import com.codurance.zombies.equipment.Equipment;

import java.util.LinkedList;

public class BackPack {

    private LinkedList<Equipment> reserve;
    private LinkedList<Equipment> elementsInHand;
    private static final int MAXIMUN_CAPACITY = 5;

    public BackPack() {
        this.reserve = new LinkedList<Equipment>();
        this.elementsInHand = new LinkedList<Equipment>();

    }

    public int getNumEquipments() {
        return this.reserve.size();
    }

    public void useEquipmentInHand(Equipment equipment) {
        this.elementsInHand.add(equipment);
    }

    public int getElementsInHand() {
        return this.elementsInHand.size();
    }

    public int getMaximunCapacity() {
        return MAXIMUN_CAPACITY;
    }

    public void pickUpEquipment(Equipment equipment) {
        if (isFull()) {
            throw new MaximunCapacityException("maximun capacity excedd");
        }
        this.reserve.add(equipment);
    }

    private boolean isFull() {
        return getNumEquipments() > MAXIMUN_CAPACITY;
    }
}
