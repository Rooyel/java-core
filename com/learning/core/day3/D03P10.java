package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = longestPrefixSuffixLength(str);
        System.out.println("Length of the longest prefix-suffix: " + length);

        scanner.close();
    }

    public static int longestPrefixSuffixLength(String str) {
        int n = str.length();
        int maxLength = 0;

        for (int i = 0; i < n / 2; i++) {
            if (str.substring(0, i + 1).equals(str.substring(n - i - 1, n))) {
                maxLength = i + 1;
            }
        }
        return maxLength;
    }
}
