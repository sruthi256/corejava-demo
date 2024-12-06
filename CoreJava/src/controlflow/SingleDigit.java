package controlflow;

import java.util.Scanner;

/*
 * java program to check whether the number is single digit or not
 */
public class SingleDigit {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		num=scan.nextInt();
		
		//implementing conditional statements and logical operators
		if (num> -10 && num<10) {
			System.out.println(num+" is single digit");
		}
		else {
			System.out.println(num+" is not a single digit");
		}
		scan.close();

	}

}
