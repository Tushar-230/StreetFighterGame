package com.streetfighter.fighter;

import com.streetfighter.state.FighterState;
import com.streetfighter.state.IdleState;
import com.streetfighter.state.StunnedState;
import com.streetfighter.state.KOState;
import com.streetfighter.strategy.AttackStrategy;
import com.streetfighter.strategy.PunchStrategy;
import com.streetfighter.observer.HealthObserver;
import java.util.ArrayList;
import java.util.List;

public class Fighter {

    protected String name;
    protected int health;
    protected int attackPower;
    protected int speed;
    private FighterState currentState;
    private AttackStrategy attackStrategy;
    private List<HealthObserver> observers = new ArrayList<>();

    public Fighter(String name, int health, int attackPower, int speed) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.speed = speed;
        this.currentState = new IdleState();
        this.attackStrategy = new PunchStrategy();
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
        notifyObservers();
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

    public void getStunned() {
        System.out.println(getName() + " got stunned!");
        setState(new StunnedState());
    }

    public void getKnockedOut() {
        System.out.println(getName() + " is knocked out!");
        setState(new KOState());
    }
    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void performAttack(Fighter target) {
        attackStrategy.execute(this, target);
    }
    public void addObserver(HealthObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (HealthObserver observer : observers) {
            observer.onHealthChanged(this.name, this.health);
        }
    }

    @Override
    public String toString() {
        return name + " [HP:" + health + ", ATK:" + attackPower + ", SPD:" + speed + "]";
    }
}