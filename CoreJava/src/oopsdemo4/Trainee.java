package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 11:32:40 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public abstract class Trainee {
	private String name;
	private String address;
	private int number;
	
	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
		
		
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	public abstract double calculateMarks(); //override in child class

}
