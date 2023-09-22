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

public class Herd implements Movable {

    private ArrayList<Movable> animals;

    public Herd() {
        this.animals = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        animals.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable animal : animals) {
            animal.move(dx, dy);
        }
    }

    public String toString() {
        String result = "";
        for (Movable animal : animals) {
            result+=animal.toString()+"\n";
        }
        return result;
    }

}
