package builder;

import character.*;
import enums.*;
import item.*;

public class HumanoidBuilder implements Builder{
    
    private String name;
    private int weight;
    private int age;
    private Characteristic characteristic;
    private Gender gender;
    private Race race;
    private Clothes clothes;
    private Armor armor;
    private Weapon weapon;
    
    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    

    @Override
    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    

    public Humanoid getHumanoid() {
        Humanoid humanoid = new Humanoid(name,age,weight,gender,race);
        humanoid.setArmor(armor);
        humanoid.setClothes(clothes);
        humanoid.setWeapon(weapon);
        humanoid.setCharacteristic(characteristic);
        return humanoid;
    }
}
