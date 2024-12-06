package collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
* Author : Kopparapu.Sruthi
* Date   : 5 Nov 2024
* Time   : 12:39:51 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		
		a1.add("Java"); // auto boxing
		a1.add("Perl");
		a1.add("C++");
		a1.add("Java");
		a1.add("C# 5.0");
		a1.add("Python");
		
		System.out.println(a1);
		
		//get elements by index
		
		System.out.println("Element at index 1 : "+a1.get(1));
		System.out.println("Does list contains element java? :"+ a1.contains("Java"));
		
		//adds element at specific index
		a1.add(2,"Oracle"); // add method is overloaded sincewe are passing 2 
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.indexOf("Python"));
		System.out.println(a1.size());
		
		//collections is a utility class
		Collections.sort(a1);
		System.out.println("After sorting : " + a1);
		
		//a1.add(100); //compile time error
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(); // default size of arraylist is 10 and we add elements size increases
		
		a2.add(100);
		a2.add(250);
		a2.add(73);
		a2.add(56);
		a2.add(350);
		a2.add(73);
		
		System.out.println(a2);
		System.out.println("Size of a2 : "+a2.size());

	}

}
