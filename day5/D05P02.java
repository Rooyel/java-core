package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the list of student names:");
        String[] names = scanner.nextLine().split(" ");
        for (String name : names) {
            studentNames.add(name);
        }

        System.out.println("Enter the name to search:");
        String searchName = scanner.nextLine();

        if (studentNames.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
