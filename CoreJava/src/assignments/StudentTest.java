package assignments;


import java.util.Scanner;


/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 9:29:27 am
* Email  : Kopparapu.Sruthi@coforge.com
*/
public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; // Array to store 3 students
 
        // Loop to take user input and create student objects
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
 
            System.out.print("Enter year of joining for " + name + ": ");
            int yearOfJoining = scanner.nextInt();
 
            System.out.print("Enter salary for " + name + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
 
            System.out.print("Enter address for " + name + ": ");
            String address = scanner.nextLine();
 
            students[i] = new Student(name, yearOfJoining, salary, address);
        }
 
        // Displaying the information of all students
        System.out.printf("%-10s %-15s %-10s %-15s%n", "Name", "Year of Joining", "Salary", "Address");
        for (Student student : students) {
            student.displayInfo();
        }
 
        scanner.close();
	}

}

