package com.projects;

public class Student extends Person {
    private int credits = 0;
    public Student(String name, String address) {
        super(name, address);
    }
    public int credits() {
        return this.credits;
    }
    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tStudy credits " + this.credits;
    }
}
