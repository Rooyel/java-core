package com.learning.core.day3;

import java.util.Scanner;

public class D03P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter the elements of the first array (sorted):");
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the second array (sorted):");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        findUnionAndIntersection(arr1, arr2);

        scanner.close();
    }

    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        System.out.print("Union of two arrays: ");
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr1[i++] + " ");
                j++;
            }
        }

        while (i < m) {
            System.out.print(arr1[i++] + " ");
        }
        while (j < n) {
            System.out.print(arr2[j++] + " ");
        }

        System.out.print("\nIntersection of two arrays: ");
        i = 0;
        j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
