package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five integer values (1-40):");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the first number (1-40): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (1-40): ");
        int num2 = scanner.nextInt();

        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int i = 0; i < numbers.length; i++) {
            if (num1 == numbers[i]) {
                foundNum1 = true;
            }
            if (num2 == numbers[i]) {
                foundNum2 = true;
            }
        }

        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Numbers not found in the array.");
        }

        scanner.close();
    }
}
