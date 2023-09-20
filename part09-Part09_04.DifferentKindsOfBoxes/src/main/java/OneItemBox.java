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
public class OneItemBox extends Box{
    private ArrayList<Item> items;
    private int capacity;
    
    public OneItemBox(){
        this.capacity=0;
        this.items=new ArrayList<>();
    }
    

    @Override
    public void add(Item item){
        if (items.isEmpty()){
            items.add(item);
            this.capacity=item.getWeight();
        }
    }
    @Override
    public boolean isInBox(Item item){
        return items.contains(item);
    };
}
