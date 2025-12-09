package place;

import java.util.ArrayList;
import character.Character;

public class Place {
    private ArrayList<Character> listCharacter = new ArrayList<>();
    
    public void addChatacter(Character character) {
        listCharacter.add(character);
    }

    public ArrayList<Character> getListCharacter() {
        return listCharacter;
    }
}
