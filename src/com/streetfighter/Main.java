package com.streetfighter;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;
import com.streetfighter.strategy.KickStrategy;
import com.streetfighter.strategy.SpecialMoveStrategy;

public class Main {
    public static void main(String[] args) {
        Fighter ryu = FighterFactory.createFighter(FighterFactory.FighterType.RYU);
        Fighter chunLi = FighterFactory.createFighter(FighterFactory.FighterType.CHUN_LI);

        System.out.println(chunLi.getName() + " health: " + chunLi.getHealth());

        ryu.performAttack(chunLi);   // default: Punch
        System.out.println(chunLi.getName() + " health: " + chunLi.getHealth());

        ryu.setAttackStrategy(new KickStrategy());
        ryu.performAttack(chunLi);
        System.out.println(chunLi.getName() + " health: " + chunLi.getHealth());

        ryu.setAttackStrategy(new SpecialMoveStrategy());
        ryu.performAttack(chunLi);
        System.out.println(chunLi.getName() + " health: " + chunLi.getHealth());
    }
}