package com.streetfighter;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter ryu = FighterFactory.createFighter(FighterFactory.FighterType.RYU);

        System.out.println("State: " + ryu.getCurrentStateName());
        ryu.pressAttack();          // Idle -> Attacking
        System.out.println("State: " + ryu.getCurrentStateName());
        ryu.pressBlock();          // should be ignored (can't block mid-attack)
        System.out.println("State: " + ryu.getCurrentStateName());
    }
}