package character;

import manager.*;

public interface Interactions {
    boolean toSee(Character character);
    void toSpeak(Character character);
    void toSniff(Smell smell);
    void toHear(Sound sound);
}