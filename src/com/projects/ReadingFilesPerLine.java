package com.projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(rows::add);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rows;
    }

}
