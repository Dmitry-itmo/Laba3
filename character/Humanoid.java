package character;

import body.*;
import enums.*;
import item.*;
import manager.*;

public class Humanoid extends Character implements Actions,Interactions,Movement{
    
    private Gender gender;
    private Race race;
    private int gold;
    private Body body = new Body();
    private Weapon weapon;
    private Clothes clothes;
    private Armor armor;

    public Humanoid(String name, int age, int weight, Gender gender, Race race) {
        super(name,age,weight);
        this.gender = gender;
        this.race = race;    
    }

    

    @Override
    public void toAttack(Humanoid character, OrganType organType) {
        int damage; 
        int protection;
        
        try {
            protection = armor.getProtection();
        } catch (NullPointerException e) {
            protection = 1;
        }

        if (weapon == null) {
            damage = (int) ((Math.random()*20 + 1 + character.getCharacteristic().power()) / protection);
            if (toDodge(character) == false) {
                System.out.println(getName() + " бьет кулаками " + character.getName());
                body.getOrgan(organType).setHP(damage);
                this.setHP(damage);
            }
        } else {
            damage = (int) ((Math.random()*20 + 1 + character.getCharacteristic().power()) / protection);
            if (toDodge(character) == false) {
                System.out.println(getName() + " атакует " + character.getName());
                body.getOrgan(organType).setHP(damage);
                this.setHP(damage);
            }
        }

        if (character.getHP() < 0) {
            character.setStatus(Status.DEAD);
        }


    }

    @Override
    public void toPush(Character character) {
        System.out.println(getName() + " толкает " + character.getName());
        character.setMood(Mood.ANGRY);
        System.out.println(character.getName() + "теперь злой");
    }

    @Override
    public boolean toDodge(Character character) {
        if (Math.random()*character.getCharacteristic().dexterity() > 5 && toSee(character)) {
            System.out.println(character.getName() + " увернулся");
            return true;
        } else {
            System.out.println(character.getName() + " не смог увернуться");
            return false;
        }
    }

    @Override
    public void toDie() {
        this.setStatus(Status.DEAD);
    }

    @Override
    public boolean toSee(Character character) {
        if (character.getStatus() == Status.INVISIBLE || getStatus() == Status.BLINDED) {
            return false;
        }
        if (Math.random()*100 + body.getOrgan(OrganType.EYES).getHP()> 100) {
            System.out.println(getName() + " смог увидеть " + character.getName());
            return true;
        } else {
            System.out.println(getName() + " не смог увидеть " + character.getName());
            return false;
        }
        
    }

    @Override
    public void toSpeak(Character character) {
        int chance;
        switch (character.getMood()) {
            case HAPPY:
                chance = 100;
                break;
            case HATE:
                chance = 0;
                break;
            case ANGRY: 
                chance = 20;
            case NORMAL: 
                chance = 50;
            case SAD: 
                chance = 30;
            default:
                chance = 40;
                break;
        }
        if (toHear(EventManager.getEventManager().getLastSound())) {
            chance += 20;
        }
        chance += clothes.getAesthetics()*10 + getCharacteristic().charisma()*10 + Math.random()*20;
        System.out.println(getName() + " начал разговор с " + character.getName());
        if (chance > 200) {
            System.out.println("Разговор с " + character.getName() + " проходит отлично");
            System.out.println(getName() + " удается поднять настроение собеседнику");
            character.setMood(Mood.HAPPY);
        } else if ( chance > 150) {
            System.out.println("Разговор с " + character.getName() + " проходит обычно");
            character.setMood(Mood.NORMAL);
        } else {    
            System.out.println("Разговор с " + character.getName() + " проходит не лучшем образом");
            System.out.println(getName() + " испортил настроение собеседнику");
            character.setMood(Mood.SAD);
        }
        Sound talk = new Sound(50,SoundType.TALK);

        EventManager.getEventManager().setLastSound(talk);
    }

    @Override
    public boolean toSniff(Smell smell) {
        if (Math.random()*100 + body.getOrgan(OrganType.EARS).getHP() > 100) {
            System.out.println(getName() + " смог понюхать");
            return true;
        } else {
            System.out.println(getName() + " не смог понюхать");
            return false;    
        }
    }

    @Override
    public boolean toHear(Sound sound) {
        if (Math.random()*100 + body.getOrgan(OrganType.EARS).getHP() > 100) {
            System.out.println(getName() + " услышал");
            return true;
        } else { 
            System.out.println(getName() + " не услышал");
            return false;
        }
    }

    @Override
    public void moving(int step) {
        int distance = getSpeed()*step;
        System.out.println(getName() + " сделал " + step + " шага, пройдя такую дистанцию " + distance);
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


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Имя персонажа: " + getName() + "\nВозраст: " + getAge() + "\nВес тела " + getWeight();
    }


}


