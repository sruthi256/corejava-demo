package assignments;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 9:28:08 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

import java.util.Scanner;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        // Taking user input for salary and hours per day
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
 
        System.out.print("Enter hours of work per day: ");
        int hoursPerDay = scanner.nextInt();
 
        // Creating an Employee object with user input
        HourlyEmployee1 employee = new HourlyEmployee1(salary, hoursPerDay);
 
        // Adding salary and work
        employee.addSalary();
        employee.addWork();
 
        // Printing the final salary
        employee.printSalary();
 
        scanner.close();

	}

}
