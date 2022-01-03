package com.projects;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    public void add(double status) {
        this.changeHistory.add(status);
    }
    public void clear() {
        this.changeHistory.clear();
    }
    public String toString() {
        return this.changeHistory.toString();
    }

    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        } else {
            return Collections.max(this.changeHistory);
        }

    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        } else {
            return Collections.min(this.changeHistory);
        }
    }


    public double average() {
        double sum = 0.0;
        double average = 0.0;
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        } else {
            for (Double value: this.changeHistory) {
                sum += value;
            }
            average = (double) sum / this.changeHistory.size();
            return average;
        }
    }





}
