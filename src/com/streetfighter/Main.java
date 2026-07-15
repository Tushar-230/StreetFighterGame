package com.streetfighter;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter ryu = FighterFactory.createFighter(FighterFactory.FighterType.RYU);

        System.out.println("State: " + ryu.getCurrentStateName());

        ryu.getStunned();
        System.out.println("State: " + ryu.getCurrentStateName());
        ryu.pressAttack();   // should be ignored — stunned
        ryu.pressBlock();    // should be ignored — stunned

        ryu.getKnockedOut();
        System.out.println("State: " + ryu.getCurrentStateName());
        ryu.pressAttack();   // should show "KO'd" message
    }
}