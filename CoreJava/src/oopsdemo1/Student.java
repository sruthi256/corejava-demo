package oopsdemo1;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 4:12:20 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to create instance class and define state and behavior
*/

//instance class
public class Student {
	
	//define properties/state/attributes
	private int rollNumber;
	private String firstName,lastName;
	private float[] marks= new float[5];
	private float total ;
	Scanner scan=new Scanner(System.in);
	
	
	//define methods/behavior/actions
	public void inputStudentDetails() {
		System.out.println("Enter Roll number of a student :");
		rollNumber=scan.nextInt();
		System.out.println("Enter first and last name of a student :");
		firstName=scan.next();
		lastName=scan.next();
		System.out.println("Enter marks of 5 subjects: ");
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=scan.nextFloat();
		}
	}
	
	//method with float as return type
	public float calculateTotalMarks() {
		for (int i=0;i<marks.length;i++) {
			total +=marks[i];
		}
		return total;
		
	}
	
	public void displaystudentDetails() {
		System.out.println("*********Student Result Information*********** ");
		System.out.println("Roll Number  :                "+ rollNumber);
		System.out.println("Student Name :                "+ firstName+" "+ lastName );
		System.out.println("Total Makrs  :                "+total);
		System.out.println("***********************************************");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.inputStudentDetails();
		s.calculateTotalMarks()	;
		s.displaystudentDetails();

	}

}
