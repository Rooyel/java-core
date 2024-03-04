package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

     public static double power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        
        double result = 1;
        boolean isNegative = exponent < 0;
        exponent = Math.abs(exponent);

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return isNegative ? 1 / result : result;
    }
}