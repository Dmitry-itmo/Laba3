package character;

import item.*;

public interface Actions {
    void toAttack(Character character);
    void toPush(Character character);
    void toDodge(Character character);
    Item toBuy(Character character, Item item);
    void toDie();


}
