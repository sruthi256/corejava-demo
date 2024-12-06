package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 10:58:50 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
*Main class to test single inheritance
*/

public class FacultyInheritanceDemo {

	public static void main(String[] args) {
		ScienceFaculty faculty;
		faculty=new ScienceFaculty("Dr. sruthi", "F123", 90000, "Biotechnology", "Genetics", 5000);
		
		//display details of science faculty
		faculty.displayDetails();

	}

}
