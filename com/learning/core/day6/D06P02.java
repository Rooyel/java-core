package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D06P02 {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Search for a phone number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's name");
        String searchName = sc.next();
        String phoneNumber = phoneBook.get(searchName);

        // Output the result
        if (phoneNumber != null) {
            System.out.println(phoneNumber);
        } else {
            System.out.println("No Number Found" + searchName);
        }
    
    }
}
