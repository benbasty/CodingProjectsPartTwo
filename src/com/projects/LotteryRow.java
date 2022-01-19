package com.projects;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
        while (this.numbers.size() < 7) {
            int randomNum = (int) this.random.nextInt(40) + 1;
            if (!this.numbers.contains(randomNum)) {

                this.numbers.add(randomNum);

            }

        }


    }

    public boolean equals(Object other) {
        return false;
    }
}
