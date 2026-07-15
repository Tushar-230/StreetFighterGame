package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class StunnedState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter) {
        System.out.println(fighter.getName() + " is stunned and can't attack!");
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        System.out.println(fighter.getName() + " is stunned and can't block!");
    }

    @Override
    public String getStateName() {
        return "Stunned";
    }
}
