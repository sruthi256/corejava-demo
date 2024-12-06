package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 3:08:03 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to find sum of n series
*/

public class SumSeries {

	public static void main(String[] args) {
		int i=0,num,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a limit : ");
		num=scan.nextInt();
		
		while(i<=num) {
			sum+=i;
			i+=1;
		}
		System.out.println("The sum of series is : "+ sum);
		scan.close();

	}

}
