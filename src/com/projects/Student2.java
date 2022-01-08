package com.projects;

public class Student2 implements Comparable<Student2>{
    private String name;

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(Student2 student) {
        return this.getName().compareTo(student.getName());
    }
}
