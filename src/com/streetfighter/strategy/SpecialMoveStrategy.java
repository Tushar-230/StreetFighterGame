package com.streetfighter.strategy;

import com.streetfighter.fighter.Fighter;

public class SpecialMoveStrategy implements AttackStrategy {

    @Override
    public void execute(Fighter attacker, Fighter target) {
        int damage = 30;
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " unleashes a SPECIAL MOVE on " + target.getName() + " for " + damage + " damage!");
    }

    @Override
    public String getMoveName() {
        return "Special Move";
    }
}
