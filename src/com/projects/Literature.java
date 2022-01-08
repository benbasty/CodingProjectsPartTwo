package com.projects;

import java.util.*;

public class Literature {
    public static void main(String[] args) {
        // book 4
        Scanner scanner = new Scanner(System.in);
        List<Book4> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book4(name,age));

        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        Comparator<Book4> comparator = Comparator
                .comparing(Book4::getName)
                .thenComparing(Book4::getAge);
        Collections.sort(books,comparator);
        books.stream().forEach(System.out::println);
    }
}
