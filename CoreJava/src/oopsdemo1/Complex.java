package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 2:59:57 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Program to Add 2 Complex Numbers - Real & Imaginary Part
* Demonstrate constructors & this keyword
*/

public class Complex {
	private double real;
	private double imaginary;
	
	
	//Generate parameterized constructor
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	
	public void add(Complex obj) {
		this.real+=obj.real; //this keyword access complex1 object complex1.real+complex2.real
		this.imaginary+=obj.imaginary; //complex1 object complex1.imaginary+complex2.imaginary
		
	}

	public void display() {
		System.out.println("The Addition of 2 Complex Numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);
	}
	
}
