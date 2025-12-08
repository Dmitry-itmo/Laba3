package item;

import enums.ShortRangeWeaponType;

public class ShortRangeWeapon extends Weapon {
    ShortRangeWeaponType type; 
    public ShortRangeWeapon(int price, int weight,int damage, ShortRangeWeaponType type) {
        super(price, weight, damage, type.getType());
        this.type = type;
    }

    public ShortRangeWeaponType getShortRangeWeaponType() {
        return type;
    }

}
