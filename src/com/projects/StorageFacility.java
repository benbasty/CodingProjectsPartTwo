package com.projects;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit,new ArrayList<>());
        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.storageUnits.get(storageUnit).remove(item);
        if (this.storageUnits.get(storageUnit).isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitKeys = new ArrayList<>();
        for (String e: storageUnits.keySet()) {
            if (storageUnits.get(e).isEmpty()) {
                unitKeys.add(e);
            }
        }
        return unitKeys;
    }




}
