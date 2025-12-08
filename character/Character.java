package character;

public abstract class Character {
    
    private String name;
    private int age;
    private int weight;


    private int HP;
    private int maxHP;
    private int speed;
    private Characteristic characteristic;


    Character(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight; 
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
}
