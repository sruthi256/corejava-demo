package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 10:14:36 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ReverseInteger {

	public static void main(String[] args) {
		int num,reversed=0;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a number :");
		num=scan.nextInt();
		
		while(num!=0) {
			int digit=num%10;
			reversed = reversed*10 + digit;
			num/=10;
		}
		System.out.println("Reversed Number :" + reversed);

	}

}
