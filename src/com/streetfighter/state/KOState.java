package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class KOState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter) {
        System.out.println(fighter.getName() + " is KO'd — no more moves!");
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        System.out.println(fighter.getName() + " is KO'd — no more moves!");
    }

    @Override
    public String getStateName() {
        return "KO";
    }
}
