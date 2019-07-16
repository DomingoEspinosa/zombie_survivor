package com.codurance.zombies.player;

public class Survivor {
    private int turns;
    private int wounds;
    private String name;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.turns = 3;
    }

    public int getWounds() {
        return this.wounds;
    }

    public void wound() {
        throw new UnsupportedOperationException();
    }
}
