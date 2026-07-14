package com.streetfighter;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter p1 = FighterFactory.createFighter(FighterFactory.FighterType.RYU);
        Fighter p2 = FighterFactory.createFighter(FighterFactory.FighterType.CHUN_LI);

        System.out.println("Player 1: " + p1);
        System.out.println("Player 2: " + p2);
    }
}