/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();

        history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        if (super.getBalance() < amount) {
            this.history.add(super.getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());

        return super.getBalance();
    }

    public void printAnalysis() {
        System.out.print("Product: " + super.getName() + "\n");
        System.out.print("History: " + this.history.toString() + "\n");
        System.out.print("Largest amount of product: " + this.history.maxValue() + "\n");
        System.out.print("Smallest amount of product: " + this.history.minValue() + "\n");
        System.out.print("Average: " + this.history.average() );

    }
}
