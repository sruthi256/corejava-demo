package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 4:59:04 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Student {
	private int rollno;
	private String name;
	
	private static String organization = "VTU";
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	//static methods can use only static variables
	public static void organizationChange() {
		organization="Wipro";
		
	}
	
	//instance method
	public void display() {
		System.out.println(this.rollno+" "+this.name+" "+organization);
	}
	
	
	

}
