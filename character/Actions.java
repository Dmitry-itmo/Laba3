package character;

import enums.OrganType;

public interface Actions {
    void toAttack(Humanoid character, OrganType organType);
    void toPush(Character character);
    boolean toDodge(Character character);
    void toDie();


}
