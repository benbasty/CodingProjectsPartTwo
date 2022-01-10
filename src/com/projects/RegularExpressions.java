package com.projects;

import java.util.Scanner;

public class RegularExpressions {
    Scanner scanner = new Scanner(System.in);
    public boolean isDayOfWeek(String string) {
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
    public boolean allVowels(String string) {
        String regex = "^[aeiou]*";
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }
    public boolean timeOfDay(String string) {
        if(string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)")){
            return true;
        } else {
            return false;
        }
    }
}
