package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 3:24:38 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* displaying odd or even
* * ODD	EVEN
* ---	----
* 1		2
* 3		4
* 5		6
* 7		8
* 9		10
*/

public class DisplayOddEven {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(" ODD\tEVEN");
		System.out.println(" ----\t-----");
		while(i<=10) {
			if (i%2!=0) {
				System.out.println(i+"\t"+(i+1));	
			}
			i+=1;
		}

	}

}
