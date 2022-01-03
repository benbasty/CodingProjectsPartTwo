package com.projects;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> list;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int actualWeight = this.capacity;

        for (Item addedItem : this.list) {
            actualWeight -= addedItem.getWeight();
        }

        if (item.getWeight() <= actualWeight) {
            this.list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item it : this.list) {
            if (it.equals(item)) {
                return true;
            }
        }
        return false;
    }

}
