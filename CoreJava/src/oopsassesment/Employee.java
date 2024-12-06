package oopsassesment;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 9:22:26 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Employee {
	private String name;
    private double salary;
 
    // Constructor for Employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
 
    // Getter for name
    public String getName() {
        return name;
    }
 
    // Getter for salary
    public double getSalary() {
        return salary;
    }
 
    // Method to return employee details
    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

