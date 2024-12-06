package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 3:28:22 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Book extends Item{
	
	private String author;

	public Book(String name, int price,String author) {
		super(name, price);
		this.author=author;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Author     :"+ author);
	}
	
	

}
