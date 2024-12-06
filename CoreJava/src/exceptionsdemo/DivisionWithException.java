package exceptionsdemo;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 6 Nov 2024
 * Time   : 12:51:44 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class DivisionWithException {

	public static void main(String[] args) {
		//Division of 2 Numbers with Exception Handling using try catch and finally blocks

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();
		 //statements to be monitored which may throw Exception
        try {
        	result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
    		System.out.println("Result = " + result);
        }
      //Exception thrown in try block is handled in catch block
        //using Exception Object
        catch (ArithmeticException ex){
        	System.out.println("Please enter second number as Non-Zero");
        	System.err.println("Exception nmae and description : "+ex.toString());
        	System.err.println("Ecxeption Description : "+ex.getMessage());
        	
        	ex.printStackTrace();
        }
        
        finally { // clean up operations
        	input.close();
        	System.out.println("in Finally block");

        }
	}

}
