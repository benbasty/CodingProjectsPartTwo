package com.projects;

public class StudentsOnAlphabeticalOrder {
    public static void main(String[] args) {
        Student2 first = new Student2("jamo");
        Student2 second = new Student2("jamo1");
        System.out.println(first.compareTo(second));
    }
}
