package com.codurance.zombies.player;

import com.codurance.zombies.equipment.Equipment;

public class Survivor {
    private int turns;
    private int wounds;
    private String name;
    private BackPack backPack;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.turns = 3;
        this.backPack = new BackPack();
    }

    public int getWounds() {
        return this.wounds;
    }

    public void wound() {
        if (isAlive()) {
            this.wounds++;
        }
    }

    public boolean isAlive() {
        return this.wounds < 2;
    }

    public int getTurns() {
        return this.turns;
    }

    public void pickUpEquipment(Equipment equipment) {
        if (this.backPack.getNumEquipments() < 5) {
            this.backPack.pickUpEquipment(equipment);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void useEquipmentInHand(Equipment equipment) {
        this.backPack.useEquipmentInHand(equipment);
    }

    public int getNumEquipments() {
        return this.backPack.getNumEquipments();
    }

    public int getElementsInHand() {
        return this.backPack.getElementsInHand();
    }
}
