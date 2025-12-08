package item;

import enums.ClothesType;

public class Clothes extends Item{
    ClothesType type;
    public Clothes(int price, int weight, ClothesType type) {
        super(price,weight);
        this.type = type;
    }

    public ClothesType getType() {
        return type;
    }

}
