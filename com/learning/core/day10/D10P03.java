package com.learning.core.day10;

import java.io.*;
import java.util.*;

public class D10P03 {
    private static final String FILE_NAME = "student_records.dat";

    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    Student student = (Student) inputStream.readObject();
                    System.out.println("Roll Number: " + student.getRollNumber());
                    System.out.println("Name: " + student.getName());
                    System.out.println("Age: " + student.getAge());
                    System.out.println("Address: " + student.getAddress());
                    System.out.println();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading data from file: " + e.getMessage());
        }
    }
}