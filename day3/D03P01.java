package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
