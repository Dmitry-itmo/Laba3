package manager;

import enums.*;

public class Smell {
    private int volume;
    private SmellType smellType;

    public Smell(int volume, SmellType smellType) {
        this.volume = volume;
        this.smellType = smellType;
    }


    public SmellType getSmellType() {
        return smellType;
    }
    public int getVolume() {
        return volume;
    }
}
