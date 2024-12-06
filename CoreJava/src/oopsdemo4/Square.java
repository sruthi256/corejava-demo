package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 10:50:53 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Square extends Shape {
	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {

		return side*side;
	}
	
	

}
