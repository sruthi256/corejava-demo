package controlflow;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 9:21:28 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class SwappingValues {

	public static void main(String[] args) {
		int a=4,b=5;
		a=a+b;
		b=a-b; 
		a=a-b;
		
		// after swapping
		System.out.println("a = " + a);
	    System.out.println("b = " + b);

	}

}
