package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 10:25:38 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

//child class employee
public class Developer extends Employee{

	private String tech;
	
	public Developer(int empId, String name, float basic,String tech) {
		super(empId, name, basic); //invokes super class constructor
		this.tech=tech;
	}
	
	public void displayDeveloperDetails() {
		System.out.println("Technology       : "+this.tech );
		System.out.println("*********************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
