package java8features;

/**
* Author : Kopparapu.Sruthi
* Date   : 8 Nov 2024
* Time   : 12:24:25 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class LambdaDemo1 {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2==0);
		NumericTest isNegative = (n) -> (n<0);
		
		System.out.println("7 is even number : "+isEven.computeTest(7));
		System.out.println("-55 is a negative number : "+isNegative.computeTest(-55));
		//boolean a= (n) -> (n%2 ==0); error - lambda expressions should be stored in instance of FI

	}

}
