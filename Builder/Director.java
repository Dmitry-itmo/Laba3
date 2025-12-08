package Builder;

import character.Humanoid;
import enums.*;

public class Director {
    
    public Humanoid makeWitcher(String name, int age, int weight, Gender gender, Builder builder) {
        return builder.getHumanoid();
    }
}
