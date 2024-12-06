package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 12:38:56 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Program to perform Arithmetic Operations using Switch Case
*/

public class SwitchDemo2 {

	public static void main(String[] args) {
		float num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		scanner.close();
		
		switch (operator) {
		
		case "+" :  result= num1+num2;
		            System.out.println("The addition of " + num1 +" and" + num2 + "is "+ result);
		            break;
		        
		case "-" :  result= num1-num2;
        System.out.println("The Substraction of " + num1+" and" + num2 + "is "+ result);
        break;
        
		case "*" :  result= num1*num2;
        System.out.println("The Multiplication of " + num1+" and" + num2 + "is "+ result);
        break;
        
		case "/" :  result= num1/num2;
        System.out.println("The Division of " + num1+" and" + num2 + "is "+ result);
        break;
		
		default:    System.out.println("Invalid operator");
		break;
		}

	}

}
