package Builder;

import enums.*;
import character.*;
import character.body.*;
import item.*;

public interface Builder {
    void setName(String name);
    void setAge(int age);
    void setWeight(int weight);
    void setGender(Gender gender);
    void setRace(Race race);
    void setCharacteristic(Characteristic characteristic);
    void setBody(Body body);
    void setClothes(Clothes clothes);
    void setArmor(Armor armor);
    Humanoid getHumanoid();
}
