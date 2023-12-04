package com.projects.diceroller;

import java.util.ArrayList;
public class DiceRollRequest {
    public DiceRollRequest(Dice dice, ArrayList<Integer> modifiers, String name) {
        this.dice = dice;
        this.modifiers = modifiers;
        this.name = name;
    }

    private Dice dice;
    public Dice getDice() {
        return dice;
    }

    private ArrayList<Integer> modifiers;
    public ArrayList<Integer> getModifiers() {
        return modifiers;
    }

    private String name;
    public String getName() {
        return name;
    }
}
