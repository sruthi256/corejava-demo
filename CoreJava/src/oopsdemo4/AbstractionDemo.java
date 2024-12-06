package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 11:40:35 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class AbstractionDemo {

	public static void main(String[] args) {
		Trainee t1 = new Marks("John", "Newyork", 100001, 44);
		System.out.println(t1);
		double result = t1.calculateMarks();
		System.out.println("Final Marks : "+ result);

	}

}
