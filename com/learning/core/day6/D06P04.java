package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book1 implements Comparable<Book1> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book1() {
		super();
	}

	public Book1(int bookId, String title, double price, String author, Date publicationDate){
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters

    @Override
    @SuppressWarnings("deprecation")
    public String toString() {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //return String.format("%d\t%s\t%.1f\t%s\t%s", bookId, title, price, author, dateFormat.format(publicationDate));
    	return bookId+" "+title+" "+price+" "+author+" "+publicationDate.getDate()+"/"+publicationDate.getMonth()+"/"+publicationDate.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, publicationDate, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book1 book = (Book1) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(publicationDate, book.publicationDate) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Book1 other) {
        return this.author.compareTo(other.author);
    }
}
public class D06P04 {

    @SuppressWarnings("deprecation")
	public static void main(String[] args){
        TreeSet<Book1> bookSet = new TreeSet<>();

        // Predefined information of 5 Book details
        bookSet.add(new Book1(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2020,2,2)));
        bookSet.add(new Book1(1002, "Modern Mainframe", 295.0, "Sharad", new Date(1997,5,19)));
        bookSet.add(new Book1(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984,11,23)));
        bookSet.add(new Book1(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984,11,19)));
        bookSet.add(new Book1(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(1984,3,6)));

        // Print all the Book details
        for (Book1 book : bookSet) {
            System.out.println(book);
        }
    }

}
