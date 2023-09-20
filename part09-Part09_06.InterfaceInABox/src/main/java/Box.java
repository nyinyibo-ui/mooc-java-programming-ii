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
public class Box implements Packable{
    
    private double maxCapacity;
    private double weight;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity){
        this.maxCapacity=maxCapacity;
        this.items=new ArrayList<>();
        this.weight=0;
    }
    
    public void add(Packable item){
        if(weight+item.weight()<maxCapacity){
            items.add(item);
            weight+=item.weight();
        }
    }
    
    public double weight(){
        double weight=0;
        for (Packable item: items){
            weight+=item.weight();
        }
        
        return weight;
    }
    
    public String toString(){
        return "Box: "+this.items.size()+" items, total weight "+this.weight+" kg";
    }
}
