package item;

import enums.*;

public class Food extends Item{
    private int fresh;
    private FoodType type;

    public Food(int price, int weight, int fresh, FoodType type) {
        super(price, weight);
        this.type = type;
        this.fresh = fresh;
    }

    public FoodType getType() {
        return type;
    }
    public int getFresh() {
        return fresh;
    }
    public void setFresh(int fresh) {
        this.fresh = fresh;
    }
}
