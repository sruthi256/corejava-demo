package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 11:09:28 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		
		employee1.inputEmployeeDetails();
		employee1.calculateNetSalary();
		employee1.displayEmployeeDetails();
		
		
		employee2.inputEmployeeDetails();
		employee2.calculateNetSalary();
		employee2.displayEmployeeDetails();
		
		
		employee3.inputEmployeeDetails();
		employee3.calculateNetSalary();
		employee3.displayEmployeeDetails();
		
		


	}

}
