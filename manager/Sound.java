package manager;

import enums.*;

public class Sound {
    private int volume;
    private SoundType soundType;

    public Sound(int volume, SoundType soundType) {
        this.soundType = soundType;
        this.volume = volume;
    }

    public SoundType getSoundType() {
        return soundType;
    }

    public int getVolume() {
        return volume;
    }

}
