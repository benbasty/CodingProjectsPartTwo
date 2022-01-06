package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {

        // Write a program that reads user input
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int numInput = Integer.parseInt(scanner.nextLine());

            //When the user gives a negative number as an input,
            // the input reading will be stopped.
            if (numInput < 0) {
                break;
            }
            nums.add(numInput);
        }
        // print all the numbers the user has given as
        // input that are between 1 and 5.
        nums.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach(System.out::println);


    }
}
