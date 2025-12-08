package Builder;

import character.*;
import character.body.*;
import enums.*;
import item.*;

public class HumanoidBuilder implements Builder{
    
    private String name;
    private int weight;
    private int age;
    private Characteristic characteristic;
    private Gender gender;
    private Race race;
    private Body body;
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
    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Humanoid getHumanoid() {
        Humanoid humanoid = new Humanoid(name,age,weight,gender,race);
        humanoid.setArmor(armor);
        humanoid.setClothes(clothes);
        humanoid.setWeapon(weapon);
        return humanoid;
    }
}
