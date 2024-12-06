package controlflow;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 24 Oct 2024
 * Time   : 4:56:17 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * Program to demonstrate for loop  
 */

public class ForDemo {

	public static void main(String[] args) {
		System.out.println("Display 1 to 10");
		for (int i = 1; i <= 10; i++) {

			System.out.print(i+"\t");
		}

		System.out.println("\nDisplay 10 to 1");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Display name 10 times");
		for (int i = 1; i <= 10; i++) {

			System.out.println("Sruthi");
		}

	}

}
