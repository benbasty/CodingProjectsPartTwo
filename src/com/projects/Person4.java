package com.projects;

public class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        if ((name != null && name.length() <= 40) && (age >= 0 && age <= 120) && (!name.equals(""))) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException("The parameters entered are incorrect");
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
