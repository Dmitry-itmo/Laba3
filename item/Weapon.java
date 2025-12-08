package item;

import enums.*;

public abstract class Weapon extends Item{
    private int damage;
    private DamageType type;

    public Weapon(int price, int weight, int damage, DamageType type) {
        super(price, weight);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public DamageType getType() {
        return type;
    }
}
