package com.learning.core.day3;
import java.util.Scanner;

import java.util.Scanner;

public class D03P09 {
    // Recursive DFS function
    static void DFS(int[][] edges, boolean[] visited, int x) {
        visited[x] = true;
        for (int i = 0; i < 26; i++) {
            if (edges[x][i] == 1 && !visited[i]) {
                DFS(edges, visited, i);
            }
        }
    }

    // Function to check if the graph is connected
    static boolean isConnected(int[][] edges, boolean[] visitedVertex, int x) {
        boolean[] visited = new boolean[26];

        // Call DFS function
        DFS(edges, visited, x);

        for (int i = 0; i < 26; i++) {
            if (visitedVertex[i] && !visited[i]) {
                return false;
            }
        }

        return true;
    }

    static boolean canBeChained(String[] arr) {
        // Create a 2D array to store the edges
        int[][] edges = new int[26][26];

        // Create arrays for storing in-degree and out-degree
        int[] in = new int[26];
        int[] out = new int[26];

        // Create an array to store visited characters
        boolean[] visited = new boolean[26];
        int first, last;

        // Count the in-degree and out-degree of strings
        for (int i = 0; i < arr.length; i++) {
            first = arr[i].charAt(0) - 'a';
            last = arr[i].charAt(arr[i].length() - 1) - 'a';

            visited[first] = true;
            visited[last] = true;

            in[last]++;
            out[first]++;
            edges[first][last] = 1;
        }

        // Check if in-degree and out-degree are the same
        for (int i = 0; i < 26; i++) {
            if (in[i] != out[i]) {
                return false;
            }
        }

        // Check if the graph is connected
        return isConnected(edges, visited, arr[0].charAt(0) - 'a');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        if (canBeChained(arr)) {
            System.out.println("Yes, they can form a circle.");
        } else {
            System.out.println("No, a circle cannot be formed.");
        }

        scanner.close();
    }
}
