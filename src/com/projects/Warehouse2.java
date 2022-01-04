package com.projects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse2 {
    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;

    public Warehouse2() {
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);

    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product,price);
        this.stockBalance.put(product,stock);
    }

    public int stock(String product) {
        return stockBalance.getOrDefault(product,0);
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {
            this.stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> productNames = new HashSet<>();
        for (String key: prices.keySet()) {
            productNames.add(key);
        }
        return productNames;
    }


}
