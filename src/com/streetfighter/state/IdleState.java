package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

public class IdleState implements FighterState {

    @Override
    public void handleAttackInput(Fighter fighter, Fighter target) {
        System.out.println(fighter.getName() + " starts attacking!");
        fighter.setState(new AttackingState());
        fighter.performAttack(target);
        fighter.setState(new IdleState()); // return to Idle right after the hit lands
    }

    @Override
    public void handleBlockInput(Fighter fighter) {
        System.out.println(fighter.getName() + " raises guard.");
        fighter.setState(new BlockingState());
    }

    @Override
    public String getStateName() {
        return "Idle";
    }
}