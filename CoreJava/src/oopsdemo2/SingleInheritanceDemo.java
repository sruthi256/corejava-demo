package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 10:32:44 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to demonstrate single inheritance
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1= new Developer(12, "Sruthi", 50000, "JDBC");
		Developer d2= new Developer(13, "Sreeja", 40000, "Hibernate");
		Developer d3= new Developer(14, "Sujitha", 35000, "Spring Framework");
		
		d1.display(); //invokes base class
		d1.displayDeveloperDetails(); //invokes child class
		
		d2.display();
		d2.displayDeveloperDetails();
		
		d3.display();
		d3.displayDeveloperDetails();
		
		//Create parent class object
		Employee employee1= new Employee(888, "Honey Singh", 3500);
		Employee employee2= new Employee(777, "Sreeja",3490);
		
		System.out.println("*********Normal Employee Details**********");
		employee1.display();
		employee2.display();

	}

}
