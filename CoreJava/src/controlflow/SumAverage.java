package controlflow;

import java.util.Scanner;

/*
 * java program to find sum and average of 3 numbers which are greater than 100
 */
public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		
		System.out.println("enter the 3 numbers: ");

		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if (a>100 && b>100 && c>100) {
		sum=a+b+c;
		avg= (float)sum/3;
		System.out.println("sum of 3 numbers is     :" +  sum);
		System.out.println("average of 3 numbers is : "+avg);
		System.out.println("average of 3 numbers is : " + String.format("%.2f", avg));
		}
		
		else {
			System.out.println("Please enter numbers greater than 100");
		}
		scan.close();
		
	}

}
