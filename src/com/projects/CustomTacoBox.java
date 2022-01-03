package com.projects;

public class CustomTacoBox implements TacoBox {
    private int initialTacos;

    public CustomTacoBox(int tacos) {
        this.initialTacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.initialTacos;
    }

    @Override
    public void eat() {
        if (initialTacos != 0) {
            initialTacos--;
        }
    }

}
