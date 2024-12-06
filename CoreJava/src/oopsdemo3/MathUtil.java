package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 4:51:58 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Static methods demo
*/

public class MathUtil {
	
	public static int square (int num) {
		return num*num;
		
	}
	public static int myAddition(int a, int b) {
		return a+b;
		
	}
	

	public static void main(String[] args) {
		int result = MathUtil.square(5);
		System.out.println("the square of 5 is : "+ result);
		System.out.println("The addition of 2 numbers is : "+ MathUtil.myAddition(400, 120));

	}

}
