/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Container {

    private int amount;
    private int maxAmount;

    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return this.amount;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    // add into the container
    public void add(int addedAmount) {
        int newAmount = this.contains();
        if (addedAmount > 0) {
            newAmount = this.amount + addedAmount;
        }

        if (newAmount > maxAmount) {
            this.setAmount(100);
        } else {
            this.setAmount(newAmount);
        }
    }

    // move the amount to the another container
    public void move(int movedAmount, Container second) {
        if ((this.contains() - movedAmount) < 0) {
            second.add(this.contains());
            this.setAmount(0);
        } else {
            second.add(movedAmount);
            this.setAmount(this.contains() - movedAmount);
        }
    }

    // remove the amount from the second container
    public void remove(int removedAmount) {
        int newAmount = 0;
        if (removedAmount > 0) {
             newAmount = this.contains() - removedAmount;
        }
        if (newAmount < 0) {
            this.setAmount(0);
        } else {
            this.setAmount(newAmount);
        }
    }

    public String toString() {
        return this.contains() + "/" + this.maxAmount;
    }

}
