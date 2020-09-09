package com.itacademy.animals.description;

import java.util.Random;

public class Cat extends Animal {
    private String color;
    private String nickname;

    public Cat(String color, String nickname) {
        super();
        this.color = color;
        this.nickname = nickname;
    }

    public int firstAttack() {
        Random diceside = new Random();
        return diceside.nextInt(6);
    }

    public boolean isCriticalChance() {
        boolean criticalchance;
        Random random = new Random();
        criticalchance = random.nextInt(30 / (getAgility() + getStrenght())) == 0;
        return criticalchance;
    }

    public int criticalStrike() {
        return (getDamage() * 2) + (getAgility() + getStrenght()) / 2;
    }

    public int Attack() {
        if (isCriticalChance()) {
            return criticalStrike();
        } else {
            return getDamage();
        }
    }

//    public int getDamage(){
//        Random random = new Random();
//        setDamage(random.nextInt(getDamage()));
//        return getDamage();
//    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        System.out.println("Поздравляем вы достигли нового уровня: " + getLevel());
        setHealth(getHealth() - getHealth() + 110);
        System.out.println("Здоровье: " + getHealth());
        setDamage(getDamage() + 2);
        System.out.println("Аттакующий урон: " + getDamage());
        setAgility(getAgility() + 2);
        System.out.println("Ловкость: " + getAgility());
        setStrenght(getStrenght() + 2);
        System.out.println("Сила: " + getStrenght());
    }

}


