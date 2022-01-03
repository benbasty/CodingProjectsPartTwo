package com.projects;

import java.util.ArrayList;
import java.util.HashMap;

public class VehiculeRegistry {
    private HashMap<LicensePlate,String> vehiculeRegistry ;
    public VehiculeRegistry() {
        this.vehiculeRegistry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehiculeRegistry.containsKey(licensePlate)) {
            this.vehiculeRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if (this.vehiculeRegistry.containsKey(licensePlate)) {
            return this.vehiculeRegistry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehiculeRegistry.containsKey(licensePlate)) {
            this.vehiculeRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate: this.vehiculeRegistry.keySet()) {
            System.out.println(licensePlate.toString());
        }

    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: this.vehiculeRegistry.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }


}
