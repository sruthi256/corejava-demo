package oopsassesment;

import java.util.ArrayList;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 9:46:47 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

class Library {
    private ArrayList<Book> books;
 
    // Constructor
    public Library() {
        books = new ArrayList<>();
    }
 
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
 
    // Method to get books by a specific author
    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
 
    // Method to calculate the total value of all books
    public double getTotalValue() {
        double totalValue = 0;
        for (Book book : books) {
            totalValue += book.getPrice();
        }
        return totalValue;
    }
}