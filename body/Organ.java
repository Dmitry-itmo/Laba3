package body;
import enums.*;

public class Organ {
    private int HP=100;
    private OrganType type;
    
    Organ(OrganType type) {
        this.type = type;
    }
    public void setHP(int damage) {
        HP -= damage;
         
    }  
    public int getHP() {
        return HP;
    }
    public OrganType getType() {
        return type;
    }
}
