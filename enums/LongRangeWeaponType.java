package enums;

public enum LongRangeWeaponType {
    CROSSBOW(DamageType.STABBING), 
    BOW(DamageType.STABBING), 
    PIPE(DamageType.STABBING);

    private DamageType type;

    private LongRangeWeaponType(DamageType type) {
        this.type = type;
    }

    public DamageType getType() {
        return type;
    }
}
