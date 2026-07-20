package com.streetfighter;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;
import com.streetfighter.observer.HealthBarUI;

public class Main {
    public static void main(String[] args) {
        Fighter ryu = FighterFactory.createFighter(FighterFactory.FighterType.RYU);
        Fighter chunLi = FighterFactory.createFighter(FighterFactory.FighterType.CHUN_LI);

        // Chun-Li's health bar is "watching" her health
        chunLi.addObserver(new HealthBarUI());

        System.out.println("-- Ryu attacks Chun-Li --");
        ryu.performAttack(chunLi);   // should auto-print a HealthBar update too

        System.out.println("-- Ryu attacks again --");
        ryu.performAttack(chunLi);
    }
}