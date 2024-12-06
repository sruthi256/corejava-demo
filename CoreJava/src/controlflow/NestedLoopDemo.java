package controlflow;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 25 Oct 2024
 * Time   : 10:04:36 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class NestedLoopDemo {

	public static void main(String[] args) {
		// Outer loop
		for(int i =1;i<=5;i++) {

			//Nested inner loop
			for(int j=1;j<=5;j++) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
		System.out.println("------------------------------------");

		for(int i =1;i<=5;i++) {

			//Nested inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
		System.out.println("------------------------------------");

		for(int i =1;i<=5;i++) {

			//Nested inner loop
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");

			}
			System.out.println();
		}
		System.out.println("------------------------------------");

		for(int i =1;i<=5;i++) {

			//Nested inner loop
			for(int j=5;j>=i;j--) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
		for(int i =1;i<=5;i++) {

			//Nested inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
		System.out.println("------------------------------------");




	}

}
