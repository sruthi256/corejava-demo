package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 3:06:40 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ComplexTest {

	public static void main(String[] args) {
		//Create complex objec with real and imaginary part
		Complex complex1=new Complex(10.3, 67.4); //invoke constructor
		Complex complex2= new Complex(0.7, 3.6);
		
		complex1.add(complex2);
		complex1.display();
		
		Complex complex3=new Complex(11.66, 22.50);
		Complex complex4= new Complex(20.20,30.60);
		
		complex3.add(complex4);
		complex3.display();

	}

}
