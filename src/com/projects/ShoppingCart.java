package com.projects;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item2> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }
    public void add(String product, int price) {
        // adds an item to the cart that matches the product given as a parameter,
        // with the price given as a parameter.
        if (this.products.containsKey(product)) {
            increaseQty(product);
        } else {
            this.products.put(product,new Item2(product,1,price));
        }
    }

    public void increaseQty(String product) {
        this.products.get(product).increaseQuantity();
    }

    public int price() {
        int totalprice = 0;
        for (Item2 p: products.values()) {
            totalprice += p.price();
        }
        return totalprice;
    }

    public void print() {
        for (String p: products.keySet()) {
            System.out.println(products.get(p).toString());
        }
    }
}
