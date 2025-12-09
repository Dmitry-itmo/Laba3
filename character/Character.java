package character;

import enums.*;

public abstract class Character {

    private String name;
    private int age;
    private int weight;
    private Mood mood;
    private Status status;

    private int HP;
    private int maxHP;
    private int speed;
    private Characteristic characteristic;

    {
        mood = Mood.NORMAL;
        status = Status.NORMAL;
    }    

    Character(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight; 
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
        maxHP = (characteristic.physique() + weight)*100;
        HP = maxHP;
        speed = characteristic.dexterity()*10 + weight/10;
    }

    public void setHP(int damage) {
        HP -= damage;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public Characteristic getCharacteristic() {
        return characteristic;
    }
    
    public int getHP() {
        return HP;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getSpeed() {
        return speed;
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
}
