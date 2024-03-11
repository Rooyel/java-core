package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book() {
		super();
	}

	public Book(int bookId, String title, double price, String author, Date publicationDate){
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
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(publicationDate, book.publicationDate) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }
}
public class D06P03 {

    @SuppressWarnings("deprecation")
	public static void main(String[] args){
        TreeSet<Book> bookSet = new TreeSet<>();

        // Predefined information of 5 Book details
        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2020,2,2)));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(1997,5,19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984,11,23)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984,11,19)));
        bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(1984,3,6)));

        // Print all the Book details
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }

}
