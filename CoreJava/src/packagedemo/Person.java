package packagedemo;

import java.util.Objects;

/**
* Author : Kopparapu.Sruthi
* Date   : 4 Nov 2024
* Time   : 4:47:13 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to demonstrate methods of object class
*/

public class Person {
	private String Name;
	private int Age;
	
	public Person(String name, int age) {
		Name = name;
		Age = age;
	}

	@Override //overriding tostring method of object class
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Age, Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Age == other.Age && Objects.equals(Name, other.Name);
	}
	

}
