package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 12:06:24 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(111, "John",29));
		al.add(new Student(222, "Mike",21));
		al.add(new Student(333, "Mary",26));
		
		Collections.sort(al);
		for (Student st:al) {
			System.out.println(st.getRollno()+ " "+ st.getName()+" "+st.getAge());
		}
		

	}

}
