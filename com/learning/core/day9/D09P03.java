package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
          System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
         boolean found = linearSearch(array, target);
        if (found) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not present");
        }
        
        scanner.close();
    }
    
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
