package com.learning.core.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D03P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Check if the string can be split into four distinct substrings
        boolean canSplit = canSplitIntoFourDistinctStrings(input);

        // Output the result
        if (canSplit) {
            System.out.println("The string can be split into four distinct substrings.");
        } else {
            System.out.println("The string cannot be split into four distinct substrings.");
        }

        scanner.close();
    }

    public static boolean canSplitIntoFourDistinctStrings(String input) {
        int length = input.length();

        // Check if the length of the string is divisible by 4
        if (length % 4 != 0) {
            return false;
        }

        // Divide the string into four parts and check for uniqueness
        String[] parts = new String[4];
        int partLength = length / 4;
        Set<String> partSet = new HashSet<>();

        for (int i = 0; i < length; i += partLength) {
            String part = input.substring(i, i + partLength);
            int partIndex = i / partLength;

            if (partSet.contains(part)) {
                return false; // Duplicate substring found
            }

            parts[partIndex] = part;
            partSet.add(part);
        }

        return true;
    }
}
