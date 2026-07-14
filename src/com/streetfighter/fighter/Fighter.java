package com.streetfighter.fighter;

/**
 * Base class for all playable characters.
 * Concrete fighters (Ryu, Ken, ChunLi) just set different stat values.
 */
public class Fighter {

    protected String name;
    protected int health;
    protected int attackPower;
    protected int speed;

    public Fighter(String name, int health, int attackPower, int speed) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.speed = speed;
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

    @Override
    public String toString() {
        return name + " [HP:" + health + ", ATK:" + attackPower + ", SPD:" + speed + "]";
    }
}
