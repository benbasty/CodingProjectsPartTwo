package com.projects;

import java.util.ArrayList;

public class Box2 implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box2(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    @Override
    public double weight() {
        double sum = 0;
        for (Packable item: items) {
            sum += item.weight();
        }
        return sum;
    }

    public void add(Packable itemToPack) {
        // The combined weight of all items in a box
        // cannot be more than the maximum capacity of the box.
        if (this.weight() + itemToPack.weight() <= maxCapacity) {
            items.add(itemToPack);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
