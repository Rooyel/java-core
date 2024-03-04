package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the left number (l): ");
        int l = scanner.nextInt();

        System.out.print("Enter the right number (r): ");
        int r = scanner.nextInt();

        int sum = 0;

        // Ensure l is less than or equal to r
        if (l <= r) {
            // Iterate from l to r and calculate the sum
            for (int i = l; i <= r; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers between " + l + " and " + r + " is: " + sum);
        } else {
            System.out.println("Left number (l) should be less than or equal to the right number (r).");
        }

        scanner.close();
    }
}