package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("All subsequences of the string:");
        printSubsequences(str);

        scanner.close();
    }

    public static void printSubsequences(String str) {
        printSubsequencesHelper(str, "");
    }

    private static void printSubsequencesHelper(String str, String current) {
        if (str.length() == 0) {
            System.out.println(current);
            return;
        }

        printSubsequencesHelper(str.substring(1), current + str.charAt(0));
        printSubsequencesHelper(str.substring(1), current);
    }
}
