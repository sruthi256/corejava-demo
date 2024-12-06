package oopsdemo3;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 29 Oct 2024
 * Time   : 2:57:24 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class ClothingProduct extends Product {

	private String size;
	private String color;



	public ClothingProduct(String name, double price, String size, String color) {
		super(name, price);
		this.size=size;
		this.color=color;
	}



	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size   : "+size);
		System.out.println("Color  : "+color);
		System.out.println("Material: Cotton");
	}



}
