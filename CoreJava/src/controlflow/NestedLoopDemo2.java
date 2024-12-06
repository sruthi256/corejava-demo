package controlflow;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 25 Oct 2024
 * Time   : 11:45:12 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		int weeks =4,days=7;
		int i =1;
		
		//Outer loop
		while (i<=weeks) {                          // 1 2 3 4  -4
			System.out.println("Week : "+i);
			
			//Inner Loop
			for (int j = 1; j <=days; j++) {
				System.out.println("\tDay : "+j);   // 7 7 7 7 - 28
			}
			i=i+1;
		}

	}

}
