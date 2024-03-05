package com.learning.core.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D03P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        List<List<Integer>> result = findCombinations(array, k);
        System.out.println("Distinct combinations of " + k + " elements:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        scanner.close();
    }

    public static List<List<Integer>> findCombinations(int[] array, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        backtrack(result, new ArrayList<>(), array, k, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] array, int k, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < array.length; i++) {
            if (i > start && array[i] == array[i - 1]) continue;
            tempList.add(array[i]);
            backtrack(result, tempList, array, k, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}