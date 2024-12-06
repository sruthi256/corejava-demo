package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
* Author : Kopparapu.Sruthi
* Date   : 5 Nov 2024
* Time   : 4:52:14 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class HashSetDemo2 {

	public static void main(String[] args) {
		 Set<String> fruits = new HashSet<>();

	        //add example
	        fruits.add("Apple");
	        fruits.add("Banana");


	        //isEmpty example
	        System.out.println("fruits set is empty = "+fruits.isEmpty());

	        //contains example
	        System.out.println("fruits contains Apple = "+fruits.contains("Apple"));
	        System.out.println("fruits contains Mango = "+fruits.contains("Mango"));

	        //remove example
	        System.out.println("Apple removed from fruits set = "+fruits.remove("Apple"));
	        System.out.println("Mango removed from fruits set = "+fruits.remove("Mango"));

	        //size example
	        System.out.println("fruits set size = "+fruits.size());

	        //addAll example -
	        List<String> list = new ArrayList<>();
	        list.add("Apple"); list.add("Apple");
	        list.add("Banana"); list.add("Mango");

	        System.out.println("fruits set before addAll = "+fruits);
	        System.out.println("list = "+list);
	        fruits.addAll(list); //Adding List contents to Set - Interoperability
	        System.out.println("fruits set after addAll = "+fruits);

	        //iterator example
	        Iterator<String> iterator = fruits.iterator();
	        while(iterator.hasNext()){
	            System.out.println("Consuming fruit "+iterator.next());
	        }

	        System.out.println("HashSet fruits Contents :"+fruits);

	        //Create TreeSet from HashSet
	        TreeSet<String> fts=new TreeSet<>(fruits);

	        System.out.println("Hash Set Converted to TreeSet :"+fts);

	}

}
