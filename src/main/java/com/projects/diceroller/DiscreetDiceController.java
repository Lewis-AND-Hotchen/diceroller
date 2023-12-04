package com.projects.diceroller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscreetDiceController {
    private Random random = new Random();
    private DiceHistory history = new DiceHistory();

	@PostMapping("/roll")
	public DiceResult rollDice(@RequestBody DiceRollRequest request) {
        int roll = random.nextInt(1, request.getDice().getValue());
        roll += request.getModifiers().stream().mapToInt(Integer::intValue).sum();
        DiceResult result = new DiceResult(roll, request.getDice(), request.getModifiers(), request.getName());
        history.getResults().add(result);
        return result;
	}

    @GetMapping("/roll/{rollName}")
	public DiceResult getRollByName(@PathVariable(value="rollName") String name) {
            return  history.getResults()
            .stream()
            .filter(result -> name.equals(result.name())).findFirst().orElse(null);
	}

    @GetMapping("/roll")
    public ArrayList<DiceResult> getAllRolls() {
        return history.getResults();
    }
}

