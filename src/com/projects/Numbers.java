package com.projects;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int number = scanner.nextInt();
        Random numbersToBePrinted = new Random();
        for (int i = 0; i < number; i++) {
            int randomNumbers = numbersToBePrinted.nextInt(10);
            System.out.println(randomNumbers);
        }
    }
}
