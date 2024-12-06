package oopsdemo2;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 28 Oct 2024
 * Time   : 11:47:40 am
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 * //Main class for testing Shopping Cart . Customer --> ShoppingCart
 */

public class ShoppingApplication {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*********Online Shopping**********");
		System.out.println("Enter Customer Name and Email  : ");
		String name = scanner.nextLine();
		String email=scanner.nextLine();
		
		scanner.close();
		
		ShoppingCart cart2=new ShoppingCart(name, email);
		ShoppingCart cart1 =new ShoppingCart("Mary John","mary@wipro.com");

		System.out.println("********** Online Shopping Portal ************");

		//Add items to Cart
		cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
		cart1.addItem("Logitech Mouse");
		cart1.addItem("Samsung HDD");
		cart1.addItem("HP Laser Printer");

		System.out.println("Customer Details :");
		cart1.display(); //Base class method
		System.out.println("Cart Details :");
		cart1.displayCart();
		cart2.display();
		cart2.displayCart();


	}

}
