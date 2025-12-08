package enums;

public enum ShortRangeWeaponType {
    SWORT(DamageType.CHOPPING), 
    HAMMER(DamageType.CRUSHING), 
    DAGGER(DamageType.CHOPPING), 
    SPEAR(DamageType.STABBING), 
    AXE(DamageType.CHOPPING);

    private DamageType type;

    private ShortRangeWeaponType(DamageType type) {
        this.type = type;
    }

    public DamageType getType() {
        return type;
    }
}
