package builder;

import character.*;
import enums.*;
import item.*;

public class Director {
    
    public void makeWitcher(Builder builder) {
        builder.setName("Геральт");
        builder.setAge(18);
        builder.setWeight(85);
        builder.setGender(Gender.MALE);
        builder.setRace(Race.WITHCER);
        builder.setCharacteristic(new Characteristic(5,5,5,5,5,5));
        builder.setClothes(new Clothes(40, 1,ClothesType.NORMAL,40));
        builder.setArmor(new Armor(50,4,ArmorType.HALF_LATS,2));
        builder.setWeapon(new ShortRangeWeapon(50,1,100,ShortRangeWeaponType.SWORT));
    }

    public void makeHuman(String name, int age, int weight, Gender gender, Builder builder) {
        builder.setName(name);
        builder.setAge(age);
        builder.setWeight(weight);
        builder.setGender(gender);
        builder.setRace(Race.HUMAN);
        builder.setCharacteristic(new Characteristic((int) Math.random()*10,(int) Math.random()*10,(int) Math.random()*10,(int) Math.random()*10,(int) Math.random()*10,(int) Math.random()*10));
        builder.setClothes(new Clothes(40, 2,ClothesType.NORMAL,40));
        builder.setArmor(null);
        builder.setWeapon(null);
    }

    public void makeElf(String name, int age, int weight, Gender gender, Builder builder) {
        builder.setName(name);
        builder.setAge(age);
        builder.setWeight(weight);
        builder.setGender(gender);
        builder.setRace(Race.ELF);
        builder.setCharacteristic(new Characteristic(2,7,5,7,7,8));
        builder.setClothes(new Clothes(40, 1,ClothesType.DRESS,100));
        builder.setArmor(new Armor(100, 2, ArmorType.CHAINMAIL,2));
        builder.setWeapon(new LongRangeWeapon(200,1,30,LongRangeWeaponType.BOW));
    }
    
}
