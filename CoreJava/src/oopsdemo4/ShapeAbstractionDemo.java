package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 10:53:05 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ShapeAbstractionDemo {

	public static void main(String[] args) {
		
		Shape s;
		s= new Circle(2);
		
		System.out.println("The area of circle is : "+s.calculateArea());
		s= new Square(3);
		System.out.println("The area of Square is : "+s.calculateArea());
	}

}
