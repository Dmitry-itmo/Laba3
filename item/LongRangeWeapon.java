package item;

import enums.*;

public class LongRangeWeapon extends Weapon{
    private LongRangeWeaponType type;
    public LongRangeWeapon(int price, int weight, int damage, LongRangeWeaponType type) {
        super(price, weight, damage, type.getType());
        this.type = type;
    }
    public LongRangeWeaponType getLongRangeWeaponType() {
        return type;
    }
}
