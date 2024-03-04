package com.learning.core.day2;
import java.util.Scanner;

public class D02P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Cubes of numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + " is " + cube);
        }

        scanner.close();
    }
}