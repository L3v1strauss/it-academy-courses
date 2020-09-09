package com.itacademy.animals.description;

abstract class Animal {
    private int health;
    private int damage;
    private int agility;
    private int strenght;
    private int level;

    Animal() {
        health = 100;
        damage = 3;
        agility = 5;
        strenght = 5;
        level = 1;
    }

    public int criticalStrike() {
        return damage * 2;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

