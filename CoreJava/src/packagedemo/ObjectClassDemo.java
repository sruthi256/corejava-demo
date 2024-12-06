package packagedemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 4 Nov 2024
* Time   : 4:52:22 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ObjectClassDemo {

	public static void main(String[] args) {
		Person p1= new Person("Sruthi", 21);
		Person p2= new Person("Sruthi", 21);
		Person p3= new Person("Ajay", 22);
		
		System.out.println("Person1 : " +p1.toString());
		System.out.println("person3 : "+p3);
		
		System.out.println("Person1 equals person2 " + p1.equals(p2));
		System.out.println("Person2 equals person3 " + p2.equals(p3));
		
		System.out.println("Person1 Hashcode : "+p1.hashCode());
		System.out.println("Person2 Hashcode : "+p2.hashCode());
		System.out.println("Person3 Hashcode : "+p3.hashCode());
		
		System.out.println("Class of person1 : "+p1.getClass().getName());

	}

}
