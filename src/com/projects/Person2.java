package com.projects;

public class Person2 {
    private String name;
    private String education;

    public Person2(String name, String education) {
        this.name = name;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education;
    }
}
