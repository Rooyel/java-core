package com.learning.core.day10;

import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
class BlankFieldException extends Exception {
    public BlankFieldException(String message) {
        super(message);
    }
}

@SuppressWarnings("serial")
class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class D10P02 {
    private static final String FILE_NAME = "student_records.dat";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Student> students = new ArrayList<>();

            while (true) {
                try {
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
                        throw new BlankFieldException("Name cannot be blank");
                    }

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    if (address.trim().isEmpty()) {
                        throw new BlankFieldException("Address cannot be blank");
                    }

                    students.add(new Student(rollNumber, name, age, address));

                    System.out.print("Do you want to add another record? (yes/no): ");
                    String choice = scanner.nextLine().toLowerCase();
                    if (!choice.equals("yes")) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Age and Roll Number must be numeric.");
                } catch (BlankFieldException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Do you want to write the data into a file? (yes/no): ");
            String writeChoice = scanner.nextLine().toLowerCase();

            if (writeChoice.equals("yes")) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                    for (Student student : students) {
                        outputStream.writeObject(student);
                    }
                    System.out.println("Data has been written to the file successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing data to file: " + e.getMessage());
                }
            } else {
                System.out.println("Program terminated.");
            }
        }
    }
}

