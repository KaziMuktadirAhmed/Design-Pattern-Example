package PatternBuilder;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> items = new ArrayList<>();

    public void addItem (FoodItem item) {
        items.add(item);
    }

    public double price() {
        double price = 0.0;

        for (FoodItem item : items) {
            price += item.packaging().price();
            price += item.price();
        }

        return price;
    }

    public void showOrderList() {
        for (FoodItem item: items) {
            System.out.println("Item name: " + item.name() + "\tPrice: " + item.price());
            System.out.println("Packaging type: " + item.packaging().packaging() + "\tPrice: " + item.packaging().price());
        }
    }
}
