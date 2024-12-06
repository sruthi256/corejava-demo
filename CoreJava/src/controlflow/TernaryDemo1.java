package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 11:46:24 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to find max of  two num using ternary operator
*/

public class TernaryDemo1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,result;
		
		System.out.println("Enter 2 numbers : ");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		
		//using ternary operator
		
		String msg=(num1>num2)? "Num1 is greatest" : "Num2 is greatest";
		System.out.println(msg);
		
		result = (num1>num2)? num1 : num2;
		System.out.println("the max of 2 numbers is : "+result);

	}

}
