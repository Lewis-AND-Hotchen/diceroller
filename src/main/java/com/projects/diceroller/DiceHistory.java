package com.projects.diceroller;

import java.util.ArrayList;

public class DiceHistory {
    private ArrayList<DiceResult> results;

    public DiceHistory(){
        results = new ArrayList<DiceResult>();
    }

    public ArrayList<DiceResult> getResults() {
        return results;
    }
}
