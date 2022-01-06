package com.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String nums = scanner.nextLine();
            if (nums.equals("end")) {
                break;
            }
            numbers.add(nums);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String printnp = scanner.nextLine();
        if (printnp.equals("n")) {
            double averageOfNegativeNums = numbers.stream().mapToDouble(Double::valueOf).filter(number -> number < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegativeNums);
        } else {
            double averageOfPositiveNums = numbers.stream().mapToDouble(Double::valueOf).filter(number -> number > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositiveNums);
        }

        //System.out.println("Average number: " + average);
    }
}
