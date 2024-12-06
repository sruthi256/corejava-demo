package assesment2;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 4 Nov 2024
 * Time   : 10:38:58 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class CollatzSequence {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		if (n>=1 && n<= Math.pow(10, 6))
		{
			while(n!=1) {
				if (n%2==0) {
					n=n/2;
					System.out.println(n);
				}
				else {
					n=3*n+1;
					System.out.println(n);
				}

			}

		}

	}
}

