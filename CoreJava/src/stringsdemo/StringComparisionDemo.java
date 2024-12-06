package stringsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 4 Nov 2024
* Time   : 12:09:33 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class StringComparisionDemo {

	public static void main(String[] args) {
		String s1 = "James Gosling";
		String s2 = "James Gosling";
		//String s2 = "James gosling";
		String s3 = new String("Hello World");
		String s4 = new String("Hello World");
		if (s1==s2) {  //== operator Checks whether Strings points to same reference
			System.out.println("Strings are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if (s3.equals(s4)) {  //equals() method checks whether String contents are equal
			System.out.println("Strings are equal ");
		}
		else {
			System.out.println("Strings are not equal");
			
		}
	}

}
