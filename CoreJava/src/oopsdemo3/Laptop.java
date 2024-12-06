package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 3:24:02 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Laptop extends Item{
	private String manufacturer;
	 public Laptop(String name, int price , String manufacturer) {
		 super (name,price);
		 this.manufacturer=manufacturer;
	 }
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Manufacturer   :"+ manufacturer);
	}
	 

}
