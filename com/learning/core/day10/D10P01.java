package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class D10P01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Check if destination file exists
        if (destinationFile.exists()) {
            System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String choice = reader.readLine();
                if (!choice.equalsIgnoreCase("Yes")) {
                    System.out.println("File copy operation aborted.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("Error reading user input. Aborting operation.");
                return;
            }
        }

        // Perform file copy
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
