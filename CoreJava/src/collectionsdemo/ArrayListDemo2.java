package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 5 Nov 2024
 * Time   : 2:16:20 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> names =new ArrayList<>();

		names.add("James"); //AutoBoxing
		names.add("Mary");
		names.add("Micheal");
		names.add("Jim");
		names.add("Robert");
		names.add("Mary");

		System.out.println("Display ArrayList as List Without Loop :"+names);

		System.out.println("********* Display Collection Objects using Classic For Loop ************");

		for (int i = 0;i<names.size();i++) {
			System.out.println(names.get(i)); // auto unboxing
		}

		//manipulations
		names.add(3,"raj");
		names.remove(0);
		names.set(1, "James Gosling");

		System.out.println("********* Display Collection Objects using ForEach Loop ************");
		for (String i:names) {
			System.out.println(i);
		}

		ArrayList<Double> marks =new ArrayList<>();

		marks.add(99.55);
		marks.add(55.00);
		marks.add(35.60);
		marks.add(74.15);
		marks.add(82.45);
		
		System.out.println("********* Display Collection Objects using Iterator************");
		
		//create iterator object for iterator in marks arraylist
		Iterator<Double> itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//collections utility class functions
		Collections.sort(marks);
		System.out.println("The marks arrayList after sorting : "+ marks);
		
		Collections.reverse(marks);
		System.out.println("The marks arrayList after reversing : "+ marks);
		
		System.out.println("Maximum Marks : "+ Collections.max(marks));
		System.out.println("Manimum Marks : "+ Collections.min(marks));

	}

}
