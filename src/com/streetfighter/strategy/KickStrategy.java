package com.streetfighter.strategy;

import com.streetfighter.fighter.Fighter;

public class KickStrategy implements AttackStrategy {

    @Override
    public void execute(Fighter attacker, Fighter target) {
        int damage = 15;
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " kicks " + target.getName() + " for " + damage + " damage!");
    }

    @Override
    public String getMoveName() {
        return "Kick";
    }
}
