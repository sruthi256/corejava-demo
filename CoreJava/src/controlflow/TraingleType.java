package controlflow;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 24 Oct 2024
 * Time   : 9:04:57 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 * Finding the type of traingle 
 */

public class TraingleType {

	public static void main(String[] args) {
		int a,b,c;

		System.out.println("enter the 3 numbers: ");

		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		scan.close();
	if(a==b && b==c) {
		System.out.println("The traingle is equilateral");
	}
	else if (a==b || b==c || a==c) {
		System.out.println("The traingle is isosceles");
		
	}
	else {
		System.out.println("The traingle is scalene");
	}

	}

}
