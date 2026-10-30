package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;

    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
        // Kalkulasi status berdasarkan level
        this.hitPoints = level * 50;
        this.attackPower = level * 15;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }
}