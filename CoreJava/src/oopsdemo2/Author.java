package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 10:14:38 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
*aggregation example
*/

public class Author {
	String authorName;
	int age;
	String place;
	
	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}


}
