package com.projects;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        //warehouse's balance after adding
        double result = (double) super.getBalance() + amount;

        // history to be added
        this.changeHistory.add(result);

        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        double result = (double) super.getBalance() - amount;

        // history to be added
        this.changeHistory.add(result);

        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());


    }


}
