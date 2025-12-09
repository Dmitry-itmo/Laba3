package manager;

public final class EventManager {
    private Smell lastSmell;
    private Sound lastSound;
    private static EventManager manager;

    private EventManager() {
         
    }

    public static EventManager getEventManager() {
        if (manager == null) {
            manager = new EventManager();
            
        }
        return manager;
    }

    public void setLastSmell(Smell lastSmell) {
        this.lastSmell = lastSmell;
    }
    public void setLastSound(Sound lastSound) {
        this.lastSound = lastSound;
    }
    public Smell getLastSmell() {
        return lastSmell;
    }
    public Sound getLastSound() {
        return lastSound;
    }
}
