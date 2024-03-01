package com.learning.core.day1;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String bookTitle;
    private double bookPrice;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}

public class D01P01 {
    public static void createBooks(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numBooks; i++) {
            Book book = new Book();
            System.out.print("Enter the title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            book.setBookTitle(title);

            System.out.print("Enter the price of book " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            book.setBookPrice(price);

            books.add(book);
            
        }
        if (scanner != null) {
            scanner.close();
        }
    }

    public static void showBooks(ArrayList<Book> books) {
        System.out.println("List of Books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + book.getBookTitle());
            System.out.println("Price: " + book.getBookPrice());
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        createBooks(books);
        showBooks(books);
    }
}