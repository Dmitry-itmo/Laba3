package place;

import java.util.ArrayList;
import item.*;

public class Market extends Place{
    private String name;
    private ArrayList<Cart> listCart = new ArrayList<>();
    
    public Market(String name) {
        this.name = name;
    }

    public void addCart(Cart cart) {
        listCart.add(cart);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cart> getListCart() {
        return listCart;
    } 

}
