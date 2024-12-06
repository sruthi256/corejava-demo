package oopsassesment;

import java.util.ArrayList;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 9:51:45 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class LibraryManagementSystem {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        // Input number of books
        System.out.print("Enter no. of Books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        Library library = new Library();
 
        // Input book details
        System.out.println("Enter Book Details (Title, Author, Price):");
        for (int i = 0; i < n; i++) {
            String title = scanner.next();
            String author = scanner.next();
            double price = scanner.nextDouble();
            Book book = new Book(title, author, price);
            library.addBook(book);
        }
 
        // Input author to search
        System.out.print("Enter Author to Search: ");
        String searchAuthor = scanner.next();
 
        // Display books by the searched author
        ArrayList<Book> booksByAuthor = library.getBooksByAuthor(searchAuthor);
        for (Book book : booksByAuthor) {
            book.displayDetails();
        }
 
        // Display the total value of all books
        System.out.println("Total Value of All Books: " + library.getTotalValue());
        
        scanner.close();
    }
}