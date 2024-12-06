package arraysdemo;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 4:30:46 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {

	public static void main(String[] args) {
		String userInput=null;
		Scanner scan=new Scanner(System.in);
		
		String[] products= {"Logitech Mouse","Boat Earbuds","HP Gaming Laptop","Samsung HDD","Phylips magic Lights","HP Printer"};
		String[] cart = new String[products.length];
		int cartIndex=0;
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
			for(int i=0;i<products.length;i++) {
				System.out.println((i+1)+". "+products[i]);
			}
			break;
		case 2:
			System.out.println("Adding products .......");
			System.out.println("Enter product number to add to cart:");
			int pno=scan.nextInt();
			if (pno>0 && pno<=products.length) {
				cart[cartIndex++]=products[pno-1];
				System.out.println("Products added to cart");
	
			}
			else {
				System.out.println("Invalid Product number");
			}
			break;
		case 3:
			System.out.println("Checking out ......");
			for(int i =0;i<cartIndex;i++) {
				System.out.println((i+1)+". "+cart[i]);
			}
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
