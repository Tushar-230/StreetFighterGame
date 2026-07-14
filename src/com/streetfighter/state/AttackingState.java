package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class AttackingState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter) {
        // Already attacking — ignore extra attack presses until it finishes
        System.out.println(fighter.getName() + " is already mid-attack, input ignored.");
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        // Can't block mid-swing
        System.out.println(fighter.getName() + " can't block while attacking!");
    }

    @Override
    public String getStateName() {
        return "Attacking";
    }
}
