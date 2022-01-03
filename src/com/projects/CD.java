package com.projects;

public class CD implements Packable {
    private String artist;
    private String name;
    private int publication;
    private double weight = 0.1;

    public CD(String artist, String name, int publication) {
        this.artist = artist;
        this.name = name;
        this.publication = publication;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publication + ")";
    }

    @Override
    public double weight() {
        return weight;
    }
}
