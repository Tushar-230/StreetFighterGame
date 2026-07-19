package com.streetfighter.strategy;

import com.streetfighter.fighter.Fighter;

public class PunchStrategy implements AttackStrategy {

    @Override
    public void execute(Fighter attacker, Fighter target) {
        int damage = 10;
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " punches " + target.getName() + " for " + damage + " damage!");
    }

    @Override
    public String getMoveName() {
        return "Punch";
    }
}
