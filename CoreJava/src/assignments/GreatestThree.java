package assignments;

import java.util.Scanner;

//program to find greatest of 3 num using if-else if-else
public class GreatestThree {

	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("enter the 3 numbers: ");

		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+ " is greatest");
		}
		else if(b>c) {
			System.out.println(b +" is greatest");
		}
		else if(a==b && b==c) {
			System.out.println("All numbers are equal");
			
		}
		else {
			System.out.println(c+" is greatest");
			}
		scan.close();
		}
	    
	}

