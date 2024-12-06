package oopsdemo3;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 29 Oct 2024
 * Time   : 3:30:27 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class UpcastingDemo {

	public static void main(String[] args) {
		Item item;

		//upcasting - child object is referred by parent object
		item = new Book("java programming", 450,"James Gosling");
		item.display(); // dynamic polymorphism

		//switch from one implementation to another bcoz of Upcasting

		item = new Laptop("Ideapad", 60000, "Lenova");
		item.display();// dynamic polymorphism
		
		item = new Book("Python made Easy", 650,"Yeshwanth ");
		item.display(); // dynamic polymorphism


	}

}
