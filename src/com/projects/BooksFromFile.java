package com.projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    public static void main(String[] args) {

    }
    public static List<Book3> readBooks(String file){
        List<Book3> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 4)
                .map(parts -> new Book3(parts[0], Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),parts[3]))
                .forEach(books::add);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        return books;
    }

}
