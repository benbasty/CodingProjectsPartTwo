package com.projects;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    @Override
    public String toString() {
        String list = "";
        for (Movable m: herds) {
            list += m.toString().trim() + "\n";
        }
        return list;
    }


    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m: herds) {
            m.move(dx,dy);
        }
    }



}
