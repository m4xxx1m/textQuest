package com.company;

public class Monsters extends Character {
    public int level;
    public Monsters(int level) {
        this.level = level;
        health = (int) (Math.random() * 10 * level) + 5;
        damage = (int) (Math.random() * 10 * level);
        money = (int) (Math.random() * level * 15);
    }
}
