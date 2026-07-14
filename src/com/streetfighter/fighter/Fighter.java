package com.streetfighter.fighter;

import com.streetfighter.state.FighterState;
import com.streetfighter.state.IdleState;

public class Fighter {

    protected String name;
    protected int health;
    protected int attackPower;
    protected int speed;
    private FighterState currentState;

    public Fighter(String name, int health, int attackPower, int speed) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.speed = speed;
        this.currentState = new IdleState();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getSpeed() {
        return speed;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void setState(FighterState newState) {
        this.currentState = newState;
    }

    public String getCurrentStateName() {
        return currentState.getStateName();
    }

    public void pressAttack() {
        currentState.handleAttackInput(this);
    }

    public void pressBlock() {
        currentState.handleBlockInput(this);
    }

    @Override
    public String toString() {
        return name + " [HP:" + health + ", ATK:" + attackPower + ", SPD:" + speed + "]";
    }
}