package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 12:56:16 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class LibrarySystem {

	public static void main(String[] args) {
		Library l = new Library();
		
		//display items in the library
		l.displayItems();
		
		//borrow and return items
		l.borrowItem("1984");
		l.borrowItem("The Great Gatsby");
		l.returnItem("1984");
		
		l.displayItems();// display items after borrowing and returning

	}

}
