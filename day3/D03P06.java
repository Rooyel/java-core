package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();

        String lastNVowels = getLastNVowels(input, n);

        if (lastNVowels.equals("Mismatch in Vowel Count")) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }

        scanner.close();
    }

    public static String getLastNVowels(String str, int n) {
        str = str.toLowerCase();
        StringBuilder lastNVowels = new StringBuilder();
        int vowelCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                lastNVowels.insert(0, ch);
                vowelCount++;
                if (vowelCount == n) {
                    return lastNVowels.toString();
                }
            }
        }
        if (vowelCount < n) {
            return "Mismatch in Vowel Count";
        }
        return lastNVowels.toString();
    }
}
