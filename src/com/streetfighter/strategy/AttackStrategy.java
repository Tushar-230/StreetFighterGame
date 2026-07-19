package com.streetfighter.strategy;

import com.streetfighter.fighter.Fighter;

/**
 * Strategy Pattern
 * -----------------
 * Each attack type (Punch, Kick, Special) implements this the same way.
 * Fighter holds one "current attack strategy" and calls execute() on it —
 * swapping strategies changes attack behavior without touching Fighter's code.
 */
public interface AttackStrategy {
    void execute(Fighter attacker, Fighter target);
    String getMoveName();
}
