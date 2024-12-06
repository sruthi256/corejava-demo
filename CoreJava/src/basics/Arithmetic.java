package basics;

import java.util.Scanner;


/*
 * java program to perform arithmetic operations using scanner input methods
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		//declaration of variables
		int  a,b,sum,sub,mul;
		float div;
		String name;
		Scanner scan = new Scanner(System.in);
		
		// take input using scanner object
		
		System.out.println("Enter two numbers : "); // short cut - sysout ctrl + space
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter your name : ");
		scan.nextLine(); // pause for input multiple words
		name= scan.nextLine();
		
		//process
		
		sum= a+b;
		sub= a-b;
		mul=a*b;
		div=(float)a/b;
		
		// display outputs
		
		System.out.println("*********Arithmetic Operations**********");
		System.out.println("Addition of two numbers is       : "+ sum);
		System.out.println("Substraction of two numbers is   : "+ sub);
		System.out.println("Multiplication of two numbers is : " + mul);
		System.out.println("Division of two numbers is       : "+ div);
		System.out.println("Program created by               : " + name);
		System.out.println("*******************************************");
		
		scan.close();
		
	}

}
