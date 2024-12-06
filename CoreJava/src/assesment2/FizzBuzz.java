package assesment2;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 4 Nov 2024
 * Time   : 9:27:47 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class FizzBuzz {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter num: ");
		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		for(int i=1;i<=a;i++) {
				if(i%3==0 && i%5==0) {
					System.out.println("FizzBuzz");

				}
				else if (i%3==0) {
					System.out.println("Fizz");
				}

				else if(i%5==0) {
					System.out.println("Buzz");
				}

				else {
					System.out.println(i);
				}
			}
			
		}

	}
