package assesment2;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 4 Nov 2024
* Time   : 11:19:54 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class TelephoneBill {

	public static void main(String[] args) {
		int max;
		System.out.println("Enter the money he spent in each quota : ");
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]= sc.nextInt();
			
		}
		System.out.println("Enter the money he can spend this month: ");
		max = sc.nextInt();
		int sum = (int) (arr[0]*0.25+arr[1]*1 + arr[2]*10);
		if (sum<max) {
			System.out.println(0+","+sum);
			
		}
		else {
			System.out.println(1 + ","+ (sum-max));
		}

	}

}
