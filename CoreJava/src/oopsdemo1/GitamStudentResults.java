package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 4:39:23 pm
* Email  : Kopparapu.Sruthi@coforge.com
* Student s = new Student();
		s.inputStudentDetails();
		s.calculateTotalMarks()	;
		s.displaystudentDetails();
*/

public class GitamStudentResults {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2= new Student();
		Student s3 = new Student();
		
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		
		float tot1=s1.calculateTotalMarks();
		float tot2=s2.calculateTotalMarks();
		float tot3=s3.calculateTotalMarks();
		
		s1.displaystudentDetails();
		System.out.println("Display total marks returned to main :"+ tot1);
		s2.displaystudentDetails();
		System.out.println("Display total marks returned to main :"+ tot2);
		s3.displaystudentDetails();
		System.out.println("Display total marks returned to main :"+ tot3);
		
		

	}

}
