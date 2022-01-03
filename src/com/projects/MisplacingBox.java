package com.projects;

import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> misplacingBox;

    public MisplacingBox() {
        this.misplacingBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBox.add(item); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {
        return false; //To change body of generated methods, choose Tools | Templates.
    }

}
