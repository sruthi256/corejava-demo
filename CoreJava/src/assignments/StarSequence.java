package assignments;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 25 Oct 2024
 * Time   : 8:54:42 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class StarSequence {

	public static void main(String[] args) {
		for(int i =1;i<=9;i+=2) {

			//Nested inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
		for(int i =1;i<=7;i+=2) {

			//Nested inner loop
			for(int j=7;j>=i;j--) {
				System.out.print("*"+"\t");

			}
			System.out.println();
		}
	}

}
