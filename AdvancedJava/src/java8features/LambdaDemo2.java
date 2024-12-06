package java8features;

/**
* Author : Kopparapu.Sruthi
* Date   : 8 Nov 2024
* Time   : 12:36:35 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/
//block lambda expressions
public class LambdaDemo2 {

	public static void main(String[] args) {
		// Lambda Expression
		MyString reverseStr = (str) -> {
			String result = " ";
			for(int i= str.length()-1 ; i>=0;i--)
				result+=str.charAt(i);
			return result;
			
		};
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		System.out.println(reverseStr.myStringFunction("Madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));
		
		
			//lambda expressions with single parameter
		
		MyString myName = (name) -> {return "Hello " + name;};
		System.out.println(myName.myStringFunction("Rag"));
		
		//lambda expressions with single parameter with no parenthesis
		MyString myName1 = name -> {return "Hello " + name;};
		System.out.println(myName1.myStringFunction("James Gosling"));
		
		
		MyString myName2 = name -> {return name + name.length();};
		System.out.println("Length of given string : "+myName2.myStringFunction("Sruthi"));

	}

	

}
