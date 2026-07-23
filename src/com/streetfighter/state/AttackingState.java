package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class AttackingState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter, Fighter target) {
        System.out.println(fighter.getName() + " is already mid-attack, input ignored.");
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        System.out.println(fighter.getName() + " can't block while attacking!");
    }

    @Override
    public String getStateName() {
        return "Attacking";
    }
}