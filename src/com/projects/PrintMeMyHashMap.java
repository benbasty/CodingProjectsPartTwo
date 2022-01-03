package com.projects;

import java.util.HashMap;

public class PrintMeMyHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    // prints all the keys in the hashmap given as a parameter
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // prints the keys in the hashmap given as a parameter
    // which contain the string given as a parameter
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // prints the values in the given hashmap which keys contain the given string.
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }




}
