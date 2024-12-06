package controlflow;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 4:19:24 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class DoWhileDemo {

	public static void main(String[] args) {
		int i=1;
		//do while condition executes atleast once ,even if condition is false
		do {
			System.out.println(i);
			i+=1;
		}
		while(i<5);
		System.out.println("Loop Terminated");

	}

}
