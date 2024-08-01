package org.example.rpg;

public class Goblin extends  Monster {
    public Goblin(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return  this.getDamage() * 0.45;
    }

    @Override
    public double poison() {
        return 0;
    }
}
