package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 11:58:00 am
* Email  : Kopparapu.Sruthi@coforge.com
*  Program to Check whether entered character is Character or not
 * using Ternary  Operator
 
*/

public class TernaryDemo2 {

	public static void main(String[] args) {
		char myChar;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Character :");
        myChar = scanner.next().charAt(0); //Character I/p

        //Ternary Operator to check Simple Conditions
        String msg =(myChar >= 'a' && myChar <='z' || myChar >= 'A' && myChar <='Z' ) ?
        myChar+" is an Alphabet": myChar+" not an Alphabet";

        System.out.println(msg);
        scanner.close();


	}

}
