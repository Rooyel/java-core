package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String replacedString = replaceSpaces(input);

        System.out.println("String after replacing spaces with %20: " + replacedString);

        scanner.close();
    }

    public static String replaceSpaces(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
