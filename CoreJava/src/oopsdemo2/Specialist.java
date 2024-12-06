package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 2:25:09 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Specialist extends Doctor{
	private String speciality;

	public Specialist(int idNumber, String name, String address, String speciality) {
		super(idNumber, name, address);
		this.speciality=speciality;
	}
	
	public void display() {
		super.display();
		System.out.println("The speciality is : "+ speciality);
	}

}

class Nonspecialist extends Doctor{

	public Nonspecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
	
}