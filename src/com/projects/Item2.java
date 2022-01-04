package com.projects;

public class Item2 {
    // An item is a product with a quantity
    private String product;
    private int qty;
    private int unitPrice;

    public Item2(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        // return the price of the item
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        // increases the quantity by one
        this.qty++;

    }

    public String toString() {
        return this.product + ": " + this.qty;
    }




}
