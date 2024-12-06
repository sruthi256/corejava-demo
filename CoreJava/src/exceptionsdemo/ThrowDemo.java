package exceptionsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 3:27:18 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ThrowDemo {
	
	public static void test(int a) {
		if(a==0) {
			throw new ArithmeticException("Pass non zero values : by Sruthi");
		}
		else {
				System.out.println("The value passed to method is "+ a);
		}
		
	}

	public static void main(String[] args) {
		ThrowDemo.test(250);
		ThrowDemo.test(0);

	}

}
