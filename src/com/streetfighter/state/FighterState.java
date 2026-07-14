package com.streetfighter.state;

import com.streetfighter.fighter.Fighter;

/**
 * State Pattern
 * --------------
 * Every concrete state (Idle, Attacking, Blocking...) implements this.
 * Fighter never checks "what state am I in" with if/else — it just calls
 * these methods on whatever state object is currently active.
 */
public interface FighterState {

    void handleAttackInput(Fighter fighter);
    void handleBlockInput(Fighter fighter);

    String getStateName();
}