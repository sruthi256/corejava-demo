package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 11:39:30 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Book {
	
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	

}
