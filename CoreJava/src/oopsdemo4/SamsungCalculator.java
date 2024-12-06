package oopsdemo4;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 12:32:17 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class SamsungCalculator implements ICalculator {
	Scanner kb;

	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);	
		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Substraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Substraction of "+a+" and "+b+" is "+s);	
		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+s);	
		
	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Division of "+a+" and "+b+" is "+s);	
		
	}
	
	public void display() {
		System.out.println("My calculator - designed by Sruthi");
	}

}
