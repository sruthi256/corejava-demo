package controlflow;

import java.util.Scanner;

//java program to check entered number is odd or even
public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even number");
		}
		else {
			System.out.println(num+" is odd number");
		}
		scan.close();

	}

}
