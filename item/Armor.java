package item;

import enums.*;

public class Armor extends Item{
   int protection;
   ArmorType type;

   public Armor(int price, int weight, ArmorType type) {
        super(price,weight);
        this.type = type;
   }
   
   public int getProtection() {
       return protection;
   }
   public ArmorType getType() {
       return type;
   }
}
