package collectionsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 12:01:48 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Student implements Comparable <Student>{
	
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Student o) {
		if(age==o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else 
			return -1;
				
	}

}
