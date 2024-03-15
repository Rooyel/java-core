package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D10P06 {
    public static void main(String[] args) {
        String englishFilePath = "DavidEnglish.txt";
        String scienceFilePath = "DavidScience.txt";
        String computerFilePath = "DavidComputer.txt";
        String outputFilePath = "DavidNotes.txt";

        compileNotes(englishFilePath, scienceFilePath, computerFilePath, outputFilePath);
    }

    private static void compileNotes(String englishFilePath, String scienceFilePath, String computerFilePath, String outputFilePath) {
        try (BufferedReader englishReader = new BufferedReader(new FileReader(englishFilePath));
             BufferedReader scienceReader = new BufferedReader(new FileReader(scienceFilePath));
             BufferedReader computerReader = new BufferedReader(new FileReader(computerFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            
            // Writing English notes
            //writer.write("English Notes:\n");
            while ((line = englishReader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.write("\n");

            // Writing Science notes
            //writer.write("Science Notes:\n");
            while ((line = scienceReader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.write("\n");

            // Writing Computer notes
            //writer.write("Computer Notes:\n");
            while ((line = computerReader.readLine()) != null) {
                writer.write(line + "\n");
            }

            System.out.println("Notes compiled successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred while compiling notes: " + e.getMessage());
        }
    }
}

