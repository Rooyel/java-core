package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class D10P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Write the input string to the file io.txt
        writeToFile("io.txt", inputString);
        
        // Show size of the file
        showFileSize("io.txt");
        
        // Read contents from the file and display them on the console
        String fileContents = readFromFile("io.txt");
        System.out.println("Contents of io.txt:");
        System.out.println(fileContents);
        
        // Delete io.txt file using File class
        deleteFile("io.txt");
        
        scanner.close();
    }
    
    // Method to write a string to a file
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Input string has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    
    // Method to show the size of a file
    private static void showFileSize(String fileName) {
        File file = new File(fileName);
        long fileSize = file.length();
        System.out.println("Size of " + fileName + " is " + fileSize + " bytes.");
    }
    
    // Method to read the contents of a file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return content.toString();
    }
    
    // Method to delete a file
    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + " has been deleted successfully.");
        } else {
            System.err.println("Failed to delete " + fileName);
        }
    }
}

