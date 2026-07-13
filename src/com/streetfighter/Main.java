package com.streetfighter;

import com.streetfighter.manager.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gm = GameManager.getInstance();
        System.out.println("Current state: " + gm.getCurrentState());
        System.out.println("Round: " + gm.getRoundNumber());

        gm.setCurrentState(GameManager.GameState.FIGHTING);
        gm.addPlayer1Point();

        // Fetch the instance again from somewhere else — should be the SAME object
        GameManager gmAgain = GameManager.getInstance();
        System.out.println("Same instance? " + (gm == gmAgain));
        System.out.println("Player 1 score (seen from second reference): " + gmAgain.getPlayer1Score());
    }
}