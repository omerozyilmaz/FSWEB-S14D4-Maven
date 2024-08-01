package org.example.rpg;

public class HungryAlphaBlackWolf extends  Monster {
    public HungryAlphaBlackWolf(String name, int hitPoints, double damage) {
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
