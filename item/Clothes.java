package item;

import enums.ClothesType;

public class Clothes extends Item{
    private ClothesType type;
    private int aesthetics;

    public Clothes(int price, int weight, ClothesType type, int aesthetics) {
        super(price,weight);
        this.type = type;
        this.aesthetics = aesthetics;
    }

    public int getAesthetics() {
        return aesthetics;
    }

    public ClothesType getType() {
        return type;
    }

}
