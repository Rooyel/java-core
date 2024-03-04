package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeroes: " + zeroCount);

        scanner.close();
    }
}