package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 3:00:35 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class OverrideDemo2 {

	public static void main(String[] args) {
		ElectronicsProduct ep1= new ElectronicsProduct("Laptop",999.99,"Dell","Latitude");
		ClothingProduct cp1= new ClothingProduct("T-shirt",15.50f,"Medium","Indigo");
		
		System.out.println("********Electronics product details**************");
		ep1.displayDetails();
		
		System.out.println("********Clothing product details**************");
		cp1.displayDetails();

	}

}
