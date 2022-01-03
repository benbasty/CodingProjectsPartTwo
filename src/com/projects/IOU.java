package com.projects;

import java.util.HashMap;

public class IOU {
    HashMap<String,Double> iou = new HashMap<>();

    public IOU() {
        this.iou = new HashMap<>();

    }

    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String key: iou.keySet()) {
            if (key.contains(toWhom)) {
                return iou.get(toWhom);
            }
        }
        return 0;

    }

}
