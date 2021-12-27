package com.projects;

import java.util.HashMap;

public class Spreadshit {
    public static void main(String[] args) {

        Book senseAndSensibility = new Book("Sense and sensibility","Scientific",1985);
        Book prideAndPrejudice = new Book("Pride And Prejudice","Science Fiction",1879);
        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        System.out.println(directory.get("Pride And Prejudice"));

    }
}
