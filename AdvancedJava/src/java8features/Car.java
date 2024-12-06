package java8features;

/**
* Author : Kopparapu.Sruthi
* Date   : 9 Nov 2024
* Time   : 11:40:39 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Car implements Vehicle{
	
	private String  brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is speeding up";
	}

	@Override
	public String slowDown() {
		return "Car is slowing down";
	}
	

}
