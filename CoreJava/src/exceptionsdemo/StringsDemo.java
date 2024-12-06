package exceptionsdemo;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 6 Nov 2024
 * Time   : 2:51:34 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 * program to handle Null Pointer Exception
 */

public class StringsDemo {

	public static void main(String[] args) {

		String s1="Hello World";
		String s2=null;
		// String s2="Java";
		try{
			System.out.println(s1.length());
			System.out.println(s2.length());
		}
		catch (Exception exception){ //general exception
			System.err.println("Exception occurred:"+exception);
		}
	}

}
