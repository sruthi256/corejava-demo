package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 10:16:00 am
* Email  : Kopparapu.Sruthi@coforge.com
*/


public class Employee {
	
	private int empId;
	private String Name;
	private float basic;
	
//Generate constructors using fields
	public Employee(int empId, String name, float basic) {
		this.empId = empId;
		Name = name;
		this.basic = basic;
	}
	
	public void display() {
		System.out.println("***********Employee Information*************");
		System.out.println("Employee Id           : "+empId);
		System.out.println("Employee name         : "+Name);
		System.out.println("Basic salary          : "+basic);
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
