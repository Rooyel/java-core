package com.learning.core.day2;

import java.util.Scanner;

public class D02P12
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}