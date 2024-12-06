package assignments;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 24 Oct 2024
 * Time   : 9:38:10 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a number :");
		num=scan.nextInt();
		
		Boolean isprime = true;
		if (num>1) {
			for (int i=2;i<=Math.sqrt(num);i++) {
				if(num%i == 0) {
					isprime = false;
					break;
				}
		
		}
		if(isprime) {
			System.out.println(num + "is a prime number :");
		}
		else {
			System.out.println(num + "is not a prime number :");
		}

	}

	}
}