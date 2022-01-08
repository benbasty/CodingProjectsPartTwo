package com.projects;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }
    public int totalWeight() {
        return this.Items.stream().map(Item::getWeight).reduce(0, Integer::sum);

    }
    public void printItems() {
        this.Items.stream().forEach(System.out::println);
    }
    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }
        return this.Items.stream().max(Comparator.comparingInt(Item::getWeight)).get();
    }
    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }


}
