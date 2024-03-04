package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 45) {
            grade = 'B';
        } else if (percentage >= 35) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}