package controlflow;

import java.util.Scanner;

/*
 * java program to find greatest of 2 numbers
 */
public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		//implementing conditional statements
		if (a>b) {
			System.out.println(a+" is greatest");
		}
		else {
			System.out.println(b+ " is greatest");
		}
		scan.close();

	}

}
