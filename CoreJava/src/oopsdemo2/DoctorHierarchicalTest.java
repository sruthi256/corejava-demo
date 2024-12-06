package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 2:30:24 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Java Program to demonstrate Hierarchical Inheritance for initializing & Display
 * different types of Doctors Information
*/

public class DoctorHierarchicalTest {

	public static void main(String[] args) {
		Specialist specialistDoctor=new Specialist(10001,"Mary King","Bengaluru","Cardiologist");

		Nonspecialist nonSpecialistDoctor=new Nonspecialist(20001,"Gavin King","Melbourne");

		specialistDoctor.display();
		nonSpecialistDoctor.display();

	}

}
