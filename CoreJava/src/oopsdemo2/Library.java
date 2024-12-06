package oopsdemo2;


import java.util.List;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 11:41:18 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Library {
	
	private List<Book> books; // composition -library has a book reference object

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	//generate getter() methods
	
	

}
