package stringsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 4:41:56 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* 	Program to Create Strings using Literals
*/

public class StringCreationDemo1 {
	
	public static void main(String[] args) {


		 /*
		         Compiler will check for the contents in string pool.
		         If it exists new string is not created, It refers to the existing string
		         If it doesn't exist a new String is created in String pool (Heap)
		         */

		        String first="Java";
		        String second="Python";
		        String third="Programming";
		        String fourth="Java"; //reuses existing Strings in the pool - Memory Efficiency

		        System.out.println("The First String is : "+first+" - Memory location : "+first.hashCode());
		        System.out.println("The Second String is : "+second+" - Memory location : "+second.hashCode());
		        System.out.println("The Third String is : "+third+" - Memory location : "+third.hashCode());
		        System.out.println("The Fourth String is : "+fourth+" - Memory location : "+fourth.hashCode());

		        System.out.println();
		        //String Operations
		        System.out.println("The Length of Second String is : "+second.length());
		        System.out.println("The Join of First & Third String : "+first.concat(third));
		        System.out.println("The Comparison of First & Second String is :"+first.equals(second));
		        System.out.println("The Comparison of First & Fourt String is :"+first.equals(fourth));

		        //Strings are Immutable - Once Created , cannot be Modified
		        String example="Hello";
		        System.out.println("The example String is : "+example+" - Memory location : "+example.hashCode());
		        example=example.concat(" World"); // Original example String remains Unchanged
		        System.out.println(example); //new reference Object created with "Hello World"
		        System.out.println("The Modified example String is : "+example+" - Memory location : "+example.hashCode());
	}

}
