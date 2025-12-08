package builder;

import enums.*;
import character.*;
import item.*;

public interface Builder {
    void setName(String name);
    void setAge(int age);
    void setWeight(int weight);
    void setGender(Gender gender);
    void setRace(Race race);
    void setCharacteristic(Characteristic characteristic);
    void setClothes(Clothes clothes);
    void setArmor(Armor armor);
    void setWeapon(Weapon weapon);
    Humanoid getHumanoid();
}
