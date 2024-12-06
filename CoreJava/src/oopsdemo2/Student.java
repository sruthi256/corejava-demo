package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 9:55:03 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to demonstrate aggregation - student class with address object - has a relationship
*/

public class Student {
	
	private int rollNo;
	private String name;
	private Address ad; // entity reference - aggregation 
	
	

	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
     
	void display()
	{
		System.out.println("------Student Details----------");
		System.out.println("Student Id       : "+rollNo );
		System.out.println("Student Name     : "+name);
		
		System.out.println("Address          : "+ad.city+" " + ad.state+" "+ad.country+" "+ad.pincode);
		
		
	}


}
