package item;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> list = new ArrayList<>();

    public void addList(Item item) {
        list.add(item);
    }

    public void roll() {
        if (list.size() > 0)  {
            list.remove((int) Math.random()*list.size());
        }
    }
}
