package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 4:30:46 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {

	public static void main(String[] args) {
		String userInput=null;
		Scanner scan=new Scanner(System.in);
	do {
		System.out.println("Welcome to our online shopping app");
		System.out.println("1.View Products");
		System.out.println("2.Add products");
		System.out.println("3.Checkout");
		System.out.println("4.Exit");
		
		System.out.println("Enter your choice : ");
		int choice =scan.nextInt();
		
		switch(choice) {
		case 1 : 
			System.out.println("Displaying products .......");
			break;
		case 2:
			System.out.println("Adding products .......");
			break;
		case 3:
			System.out.println("Checking out ......");
			break;
		case 4:
			System.out.println("exiting applicaion. Goodbye!!");
			return;//exit switch case
		default :
			System.out.println("Invalid Choice");
			
		}
		System.out.println("Do you want to continue shopping ? (Yes/No)");
		userInput =scan.next();
		
		

	}while(userInput.equalsIgnoreCase("yes"));
	 
	System.out.println("Thanks for shopping with us");
	scan.close();

}
	
}
