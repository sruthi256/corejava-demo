package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 10:06:38 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class SumOfDigits {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a number :");
		num=scan.nextInt();
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		
		System.out.println("Sum of digits is : "+sum);

	}

}
