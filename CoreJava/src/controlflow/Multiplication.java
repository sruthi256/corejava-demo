package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 3:15:44 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to display multiplication of a number
*/

public class Multiplication {

	public static void main(String[] args) {
		int num,mul=1,i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=scan.nextInt();
		scan.close();
		
		System.out.println("Multiplication table of "+num);
		while(i<=10) {
			mul=num*i;
			System.out.println(num+" * "+i+" = " + mul);
			i+=1;
		}

	}

}
