/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public MisplacingBox() {
        this.capacity = 0;
    }

    public void add(Item item) {
        if (this.capacity >= item.getWeight()) {
            this.capacity -= item.getWeight();
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return false;
             
    }
;
}
