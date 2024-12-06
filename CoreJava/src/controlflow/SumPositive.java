package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 4:26:42 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to find sum of positive numbers
*/

public class SumPositive {

	public static void main(String[] args) {
		int sum =0,number=0;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("Enter a Number : ");
			number=scanner.nextInt();
			if(number > 0) {
				sum+=number;
			}
		} while (number>0);
		
		System.out.println("The Sum Of Positive Numbers entered by User is : "+sum);
		scanner.close();

	}

}
