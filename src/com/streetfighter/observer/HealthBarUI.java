package com.streetfighter.observer;

public class HealthBarUI implements HealthObserver {

    @Override
    public void onHealthChanged(String fighterName, int currentHealth) {
        System.out.println("[HealthBar] " + fighterName + "'s health bar updated -> " + currentHealth + "/100");
    }
}
