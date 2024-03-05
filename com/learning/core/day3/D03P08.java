package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int deletions = minDeletionsForPalindrome(str);
        System.out.println("Minimum deletions to make the string a palindrome: " + deletions);

        scanner.close();
    }

    public static int minDeletionsForPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int start = 0; start < n - len + 1; start++) {
                int end = start + len - 1;
                if (str.charAt(start) == str.charAt(end) && len == 2) {
                    dp[start][end] = 2;
                } else if (str.charAt(start) == str.charAt(end)) {
                    dp[start][end] = dp[start + 1][end - 1] + 2;
                } else {
                    dp[start][end] = Math.max(dp[start][end - 1], dp[start + 1][end]);
                }
            }
        }

        return n - dp[0][n - 1];
    }
}
