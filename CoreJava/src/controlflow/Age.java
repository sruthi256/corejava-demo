package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 9:28:13 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Age {

	public static void main(String[] args) {
		int year,age;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter Your birth year :");
		year=scan.nextInt();
		age=2024-year;
		

		System.out.println("Your age is  :"+age);
		
		

	}

}
