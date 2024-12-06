package oopsdemo1;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 10:47:46 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to enter employee details ,calculate net salary , and display salary slip
*/

public class Employee {
	
	//Data abstraction- Define properties and methods as  per application in hand
	//define attributes
	private int empId;
	private String firstName,lastName,desig;
	private double basic,hra,da,grossSalary,netSalary;
	private static final double TAX = 1000; //constant declaration
	
	Scanner scan = new Scanner(System.in);
	
	//Default constructor - compiler creates it for automatic initialization of object properties
		
    //define methods
	
	public void inputEmployeeDetails() {
		System.out.println("Enter EmployeeId, FirstName,LastName, and designation");
		empId= scan.nextInt();
		firstName=scan.next();
		lastName=scan.next();
		scan.nextLine();
		desig=scan.nextLine();
		System.out.println("Enter basic salary of a employee :");
		basic = scan.nextDouble();
		
		
	}
	
	public void calculateNetSalary() {
		hra = basic *0.25;  //hra is a 25% of a salary
		da= basic*0.15;    //da is a 25% of a salary
		grossSalary=basic+hra+da;
		netSalary=grossSalary-TAX;
		
	}
	
	public void displayEmployeeDetails() {
		System.out.println("**********Employee Salary Slip*********");
		System.out.println("Employee ID       : "+ empId);
		System.out.println("Employee Name     : "+firstName+ " "+lastName);
		System.out.println("Designation       :"+desig);
		System.out.println("Basic             :"+basic);
		System.out.println("HRA               :"+ hra);
		System.out.println("da                :"+da);
		System.out.println("Gross Salary      :"+grossSalary);
		System.out.println("tax               :"+TAX);
		System.out.println("--------------------------------------------");
		System.out.println("Net Salary        :"+netSalary);
		System.out.println("--------------------------------------------");
	}
	
}
