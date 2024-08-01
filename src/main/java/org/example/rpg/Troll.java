package org.example.rpg;

public class Troll extends Monster{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return  this.getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return this.getDamage() * 0.3;
    }
}
