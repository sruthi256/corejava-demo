package exceptionsdemo;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 6 Nov 2024
 * Time   : 4:17:17 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * Throws keyword is used to define exceptions , that a method can throw in OOP.
 */

public class ThrowsDemo {

	void division(int a, int b) throws ArithmeticException
	{
		int result = a/b;
		System.out.println("The Division is : "+result);
	}



	public static void main(String[] args) {
		ThrowsDemo td1=new ThrowsDemo();

		try{
			td1.division(10,0);
		}
		catch (ArithmeticException e){
			System.err.println(e);
		}

		try{
			td1.division(10,3);
		}
		catch (ArithmeticException e){
			System.err.println(e);
		}

	}

}
