package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> yearBirthDates = new ArrayList<>();
        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }
            if (command.equals("")) {
                System.out.print("Input first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Input last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Input the year of birth: ");
                String yearBirth = scanner.nextLine();
                System.out.println();
                firstNames.add(firstName);
                lastNames.add(lastName);
                yearBirthDates.add(yearBirth);
            }
        }
        System.out.println();
        System.out.println("Unique last names in alphabetical order:");
        lastNames.stream().sorted().forEach(System.out::println);
    }
}
