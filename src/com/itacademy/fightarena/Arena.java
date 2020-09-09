package com.itacademy.fightarena;

import com.itacademy.animals.description.Cat;

public class Arena {
    public static void main(String[] args) {
        Cat catzilla = new Cat("red", "Killer");
        Cat catkong = new Cat("black", "Ripper");
        if (catzilla.firstAttack() > catkong.firstAttack()) {
            while (catzilla.getHealth() > 0 && catkong.getHealth() > 0) {
                System.out.println("Killer атакует");
                catkong.setHealth(catkong.getHealth() - catzilla.Attack());
                if (catzilla.Attack() == catzilla.criticalStrike()) {
                    System.out.println("Killer наносит критический урон: " + catzilla.Attack() + " едениц");
                } else {
                    System.out.println("Killer наносит " + catzilla.Attack() + " еденицы урона");
                }
                System.out.println("Оставшееся здоровье Ripper: " + catkong.getHealth());
                System.out.println("Ripper атакует");
                catzilla.setHealth(catzilla.getHealth() - catkong.Attack());
                if (catkong.Attack() == catkong.criticalStrike()) {
                    System.out.println("Ripper наносит критический урон: " + catkong.Attack() + " едениц");
                } else {
                    System.out.println("Ripper наносит " + catkong.Attack() + " еденицы урона");
                }
                System.out.println("Оставшееся здоровье Killer: " + catzilla.getHealth());
            }
        } else {
            while (catzilla.getHealth() > 0 && catkong.getHealth() > 0) {
                System.out.println("Ripper атакует");
                catzilla.setHealth(catzilla.getHealth() - catkong.Attack());
                if (catkong.Attack() == catkong.criticalStrike()) {
                    System.out.println("Ripper наносит критический урон: " + catkong.Attack() + " едениц");
                } else {
                    System.out.println("Ripper наносит " + catkong.Attack() + " еденицы урона");
                }
                System.out.println("Оставшееся здоровье Killer: " + catzilla.getHealth());
                System.out.println("Killer атакует");
                catkong.setHealth(catkong.getHealth() - catzilla.Attack());
                if (catzilla.Attack() == catzilla.criticalStrike()) {
                    System.out.println("Killer наносит критический урон: " + catzilla.Attack() + " едениц");
                } else {
                    System.out.println("Killer наносит " + catzilla.Attack() + " еденицы урона");
                }
                System.out.println("Оставшееся здоровье Ripper: " + catkong.getHealth());
            }
        }
        if(catzilla.getHealth() > catkong.getHealth()){
            System.out.println("Killer одерживает победу единогласным решением судей!");
            catzilla.levelUp();

        } else {
            System.out.println("Ripper одерживает победу единогласным решением судей!");
            catkong.levelUp();
        }
    }
}
