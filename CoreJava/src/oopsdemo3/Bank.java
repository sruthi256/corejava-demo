package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 2:31:43 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
*  Overriding is a feature that allows a subclass or
 child class to provide a specific implementation of a method
 that is already provided by one of its super-classes or parent classes.
*/

public class Bank {
	private String name;
	
	public Bank(String  name) {
		this.name=name;
		
	}
	//method to be  overridden
	int getRateofInterest() {
		return 0;
	}
	
	void display() {
		System.out.println("Welcome to "+name+ " bank");
	}

}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
		
	}

	@Override
	int getRateofInterest() {
		// TODO Auto-generated method stub
		return 5;
	}	
}

class axis extends Bank{

	public axis(String name) {
		super(name);
	}

	@Override
	int getRateofInterest() {

		return 6;
	}		
}

class icici extends Bank{

	public icici(String name) {
		super(name);
	}

	@Override
	int getRateofInterest() {
		
		return 7;
	}
}
