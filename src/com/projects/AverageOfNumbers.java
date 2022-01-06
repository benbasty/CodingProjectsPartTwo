package com.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
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
        double average = numbers.stream().mapToDouble(Double::valueOf).average().getAsDouble();
        System.out.println("Average number: " + average);
    }
}
