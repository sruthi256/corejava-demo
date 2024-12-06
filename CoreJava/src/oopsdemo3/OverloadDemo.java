package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 12:28:05 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class OverloadDemo {

	public static void main(String[] args) {
		Addition ad1= new Addition(33,45);
		
		//invoke overload methods
		ad1.add();
		ad1.add(999);
		ad1.add(89,175);
		ad1.add(450,350.50f);
		ad1.add(20.50f,45.50f); //type promotion - calls methods with double type parameters
		ad1.add("hello","world");
		ad1.add(300,250,500);
		

	}

}
