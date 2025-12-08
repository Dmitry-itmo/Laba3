package character;

import enums.*;
import item.*;
import character.body.*;
import manager.*;

public class Humanoid extends Character implements Actions,Interactions,Movement{
    
    private Gender gender;
    private Race race;
    private int gold;
    private Mood mood;
    private Status status;
    private Body body;
    private Weapon weapon;
    private Clothes clothes;
    private Armor armor;

    public Humanoid(String name, int age, int weight, Gender gender, Race race) {
        super(name,age,weight);
        this.gender = gender;
        this.race = race;
         
    }

    

    @Override
    public void toAttack(Character character) {
        
    }

    @Override
    public void toPush(Character character) {
        
    }

    @Override
    public void toDodge(Character character) {
        
    }

    @Override
    public void toDie() {
        
    }

    @Override
    public boolean toSee(Character character) {
        return false;
    }

    @Override
    public void toSpeak(Character character) {
        
    }

    @Override
    public void toSniff(Smell smell) {
        
    }

    @Override
    public void toHear(Sound sound) {
        
    }

    @Override
    public int moving(int step) {
        return 0;
    }

    @Override
    public int highJump() {
        return 0;
    }

    @Override
    public int longJump() {
        return 0;
    }

    @Override
    public Item toBuy(Character character, Item item) {
        return null;
    }

    public int getGold() {
        return gold;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }

    public Status getStatus() {
        return status;
    }

    public Mood getMood() {
        return mood;
    }
    

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}






