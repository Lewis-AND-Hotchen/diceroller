package com.projects.diceroller;

import java.util.ArrayList;

public record DiceResult(int result, Dice dice, ArrayList<Integer> modifiers, String name) {
}
