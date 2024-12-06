package basics;

/**
* Author : Kopparapu.Sruthi
* Date   : 5 Nov 2024
* Time   : 5:30:07 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Recursion {
	static int n1=0,n2=1,n3=0;
	static void printFibonacciSeries(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			printFibonacciSeries(count-1);
		}
		
	}
	

	public static void main(String[] args) {
		int count =10;
		System.out.println(n1+" "+n2);
		printFibonacciSeries(count-2);
		
		
		

	}

}
