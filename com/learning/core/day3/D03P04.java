package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int firstRepeatingIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    firstRepeatingIndex = i;
                    break;
                }
            }
            if (firstRepeatingIndex != -1) {
                break;
            }
        }

        if (firstRepeatingIndex != -1) {
            System.out.println("The first repeating element is " + array[firstRepeatingIndex] + " at index " + firstRepeatingIndex);
        } else {
            System.out.println("There is no repeating element in the array.");
        }

        scanner.close();
    }
}
