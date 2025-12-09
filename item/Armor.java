package item;

import enums.*;

public class Armor extends Item{
   private int protection;
   private ArmorType type;

   public Armor(int price, int weight, ArmorType type, int protection) {
        super(price,weight);
        this.type = type;
        this.protection = protection;
   }
   
   public int getProtection() {
       return protection;
   }
   public ArmorType getType() {
       return type;
   }
}
