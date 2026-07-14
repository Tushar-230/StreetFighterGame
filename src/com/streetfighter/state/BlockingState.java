package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class BlockingState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter) {
        System.out.println(fighter.getName() + " drops guard and attacks!");
        fighter.setState(new AttackingState());
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        System.out.println(fighter.getName() + " is already blocking.");
    }

    @Override
    public String getStateName() {
        return "Blocking";
    }
}
