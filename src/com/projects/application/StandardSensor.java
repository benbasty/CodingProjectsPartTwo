package com.projects.application;

public class StandardSensor implements Sensor {
    private int num;

    public StandardSensor(int num) {
        this.num = num;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalArgumentException("The sensor is not on");
        }
        return this.num;
    }
}
