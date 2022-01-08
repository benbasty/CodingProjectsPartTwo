package com.projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LteracyComparaison {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((l1,l2) -> l1[5].compareTo(l2[5]))
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1].trim() + ", " + line[5]));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
