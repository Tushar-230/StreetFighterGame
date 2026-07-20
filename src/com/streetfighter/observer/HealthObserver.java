package com.streetfighter.observer;


/**
 * Observer Pattern
 * -----------------
 * Anything that needs to react to a fighter's health changing implements
 * this. Fighter (the "subject") doesn't know or care what its observers
 * do — it just calls onHealthChanged() on all of them whenever health changes.
 */
public interface HealthObserver {
    void onHealthChanged(String fighterName, int currentHealth);
}