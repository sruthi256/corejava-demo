package controlflow;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 9:48:13 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class JumpDemo {

	public static void main(String[] args) {
		int i;
		
		System.out.println("*******Break statement demo**********");
		for (int i1 = 1; i1 <= 10; i1++) {
			if(i1==5) break;

			System.out.println(i1);
		}
		System.out.println("************Continue  statement demo***********");
		for (int i1 = 1; i1 <= 10; i1++) {
			if(i1>4 && i1<9) continue;

			System.out.println(i1);
		}
	}
	
	

}
