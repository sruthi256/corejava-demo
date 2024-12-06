package java8features;

/**
* Author : Kopparapu.Sruthi
* Date   : 9 Nov 2024
* Time   : 10:40:02 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

//Java program to use Method Reference to a Constructor
interface IMessage
{
	ConstructorReference getMessage(String msg);
}

class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		IMessage hello = ConstructorReference::new;
		hello.getMessage("Method Reference to constructor");
		
		ConstructorReference a = new ConstructorReference("Hello");
		

	}

}
