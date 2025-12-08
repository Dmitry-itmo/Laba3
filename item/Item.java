package item;

public abstract class Item {
    private int weight;
    private int price;

    Item(int price, int weight) {
        this.weight = weight;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
}
