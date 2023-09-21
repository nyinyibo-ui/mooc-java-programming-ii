/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item it : items.values()) {
            total += it.price();
        }
        return total;
    }

    public void print() {
        for (String name : items.keySet()) {
            System.out.println(name + ": " + items.get(name).getQty());
        }
    }

}
