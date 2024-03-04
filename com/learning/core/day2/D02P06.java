package com.learning.core.day2;

import java.util.Scanner;

public class D02P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number representing the day of the week (1 to 7): ");
        int dayNumber = scanner.nextInt();

        String weekday;

        if (dayNumber >= 1 && dayNumber <= 7) {
            if (dayNumber == 1) {
                weekday = "Sunday";
            } else if (dayNumber == 2) {
                weekday = "Monday";
            } else if (dayNumber == 3) {
                weekday = "Tuesday";
            } else if (dayNumber == 4) {
                weekday = "Wednesday";
            } else if (dayNumber == 5) {
                weekday = "Thursday";
            } else if (dayNumber == 6) {
                weekday = "Friday";
            } else {
                weekday = "Saturday";
            }

            System.out.println("The corresponding weekday is: " + weekday);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}