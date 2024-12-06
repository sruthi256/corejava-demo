package basics;

import java.util.Scanner;

/*
 * java program to find sum and average of 3 num
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
		sum=a+b+c;
		avg= (float)sum/3;
		System.out.println("sum of 3 numbers is :" +  sum);
		System.out.println("average of 3 numbers is : "+avg);
		System.out.println("average of 3 numbers is : " + String.format("%.2f", avg));
		
		scan.close();
		
	}

}
