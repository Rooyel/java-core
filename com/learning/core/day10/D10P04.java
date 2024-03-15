package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class D10P04 {
    public static void main(String[] args) {
        // Source and destination file paths
        Path sourceFilePath = (Path)Paths.get("source.txt");
        Path destinationFilePath = (Path)Paths.get("destination.txt");

        try {
            // Copy the contents of the source file to the destination file
            Files.copy(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}

