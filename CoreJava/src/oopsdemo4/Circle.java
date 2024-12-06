package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 10:47:06 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public  class Circle extends Shape {
	private final double radius;
	

	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		
		return radius*radius*Math.PI;
	}

}
