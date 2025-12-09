package item;

import enums.FoodType;
import enums.SmellType;
import manager.*;
// ??
public class Fish extends Food{
    private Smell smell; 
    public Fish(int price, int weight, int fresh) {
        super(price, weight, fresh, FoodType.FISH);
    }

    public Smell getSmell() {
        return smell;
    }

    public void goneBad() {
        if (Math.random() < 0.3) {
            super.setFresh(0);
            smell = new Smell(100, SmellType.STINKY);
        } else {
            super.setFresh(10);
        }
    }
}
