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

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    public void add(Item item) {
        if (this.capacity >= item.getWeight()) {
            this.capacity -= item.getWeight();
            items.add(item);
        }
    }


    public boolean isInBox(Item item){
        if (items.contains(item)){
            return true;
        }else{
            return false;
        }
    };
}
