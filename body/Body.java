package body;
import enums.*;
public class Body {
    private Organ organs[] = {
        new Organ(OrganType.RIGHT_ARM),
        new Organ(OrganType.LEFT_ARM),
        new Organ(OrganType.RIGHT_LEG),
        new Organ(OrganType.LEFT_LEG),
        new Organ(OrganType.HEAD),
        new Organ(OrganType.EYES),
        new Organ(OrganType.NOSE),
        new Organ(OrganType.NECK),
        new Organ(OrganType.EARS)
    };

    public Organ getOrgan(OrganType type) {
        for (Organ i : organs) {
            if (i.getType() == type) {
                return i;
            }
        }
        return null;
    }
}
