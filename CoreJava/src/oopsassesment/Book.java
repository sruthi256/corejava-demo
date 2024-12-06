package oopsassesment;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 9:45:58 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

import java.util.ArrayList;
import java.util.Scanner;
 
class Book {
    private String title;
    private String author;
    private double price;
 
    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
 
    // Getter for the author
    public String getAuthor() {
        return author;
    }
 
    // Getter for the price
    public double getPrice() {
        return price;
    }
}