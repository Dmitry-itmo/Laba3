package character;

import manager.*;

public interface Interactions {
    boolean toSee(Character character);
    void toSpeak(Character character);
    boolean toSniff(Smell smell);
    boolean toHear(Sound sound);
}