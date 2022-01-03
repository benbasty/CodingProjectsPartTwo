package com.projects;

import java.util.HashMap;

public class PrintMeAnotherHashMap {
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", "fiction", 1831));
        hashmap.put("prejudice", new Book("Pride and prejudice", "action", 2010));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    // prints all the values in the hashmap
    // using the toString method of the Book objects.
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book value: hashmap.values()) {
            System.out.println(value.toString());
        }
    }

    // which prints only the Books in the given hashmap which name contains the given string
    // find out the name of a Book with the method getName.
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book value: hashmap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value.toString());
            }
        }
    }
}
