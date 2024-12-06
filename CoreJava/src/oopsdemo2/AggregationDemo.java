package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 10:07:47 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1= new Address("Benguluru","Karnataka","India",566016);
		Address ad2= new Address("Prague","Austin","Czech Republic",777777);
		
		Student s1 = new Student(101,"Ravi Kumar",ad1);
		Student s2= new Student(102, "Mike daniel", ad2);
		
		s1.display();
		s2.display();

	}

}
