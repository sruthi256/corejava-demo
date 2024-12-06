package basics;

import java.util.Scanner;

/*
 * Program to enter RollNumber,First Name, Marks of 5 Subjects of a Student,
 * and Calculate Total Marks, Percentage & Display the Details.
 */
public class StudentResult {

	public static void main(String[] args) {
		//Declarations
		int rollNumber;
		String firstName;
		float marks1,marks2,marks3,marks4,marks5,total,percentage;
		Scanner scan = new Scanner(System.in);

		//Input
		System.out.println("Enter Roll Number & Name of a Student :");
		rollNumber=scan.nextInt();
		firstName=scan.next();//Single word
		System.out.println("Enter Marks of 5 Subjects");
		marks1=scan.nextInt();
		marks2=scan.nextInt();
		marks3=scan.nextInt();
		marks4=scan.nextInt();
		marks5=scan.nextInt();

		//Calculate Total Marks & Percentage
		total=marks1+marks2+marks3+marks4+marks5;
		percentage=(total/500)*100;

		//Display
		System.out.println("************* Student Information **************");
		System.out.println("Roll Number         : "+rollNumber);
		System.out.println("Student Name        : "+firstName);
		System.out.println("Student Marks       : "+marks1+" "+marks2+" "+marks3+" "+marks4+" "+marks5);
		System.out.println("Total Marks         : "+total);
		System.out.println("-------------------------------------------------");
		System.out.println("Percentage          : "+String.format("%.2f", percentage));
		System.out.println("*************************************************");

		scan.close();

	}

}
