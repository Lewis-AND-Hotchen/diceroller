package com.projects.diceroller;

public enum Dice {
    d4(4),
    d6(6),
    d8(8),
    d10(10),
    d12(12),
    d20(20);

    private int value;
    private Dice(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
