package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Author : Kopparapu.Sruthi
* Date   : 9 Nov 2024
* Time   : 12:31:12 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class StreamExample1 {

	public static void main(String[] args) {
		
		Integer [] marks = { 45,88,99,75,23};
		
		//Build stream for arrays 
		Stream<Integer> strm = Stream.of(marks);
		
		//Lambda expressions are used to pass parameters to another function
		strm.forEach(i -> System.out.println(i));
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		//Build stream from collections
		Stream<Integer> strm1 = grades.stream();
		
		//strm1.forEach(i -> System.out.println(i));
		
		System.out.println("*******ArrayList Contents**********");
		strm1.forEach(System.out::println);
		
		//intermediate operations - map() and terminal operations - collect()
		List<Integer> squares = grades.stream().map(m -> m*m).collect(Collectors.toList());
		
		System.out.println("*******Double of Grades**********");
		System.out.println(squares);
		
	}

}
