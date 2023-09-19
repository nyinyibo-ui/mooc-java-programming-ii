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

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double maxVal = this.history.get(0);
        if (this.history.isEmpty()){
            return 0;
        }
        for (double val : this.history) {
            if (val > maxVal) {
                maxVal = val;
            }
        }

        return maxVal;
    }

    public double minValue() {
        double minVal = this.history.get(0);
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (double val : this.history) {
            if (val < minVal) {
                minVal = val;
            }
        }

        return minVal;
    }
    
    public double average(){
        double sum=0;
        if (this.history.isEmpty()){
            return 0;
        }
        for (double val: this.history){
            sum+=val;
        }
        
        return sum/this.history.size();
    }
}
