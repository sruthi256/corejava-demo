package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 12:14:53 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Addition {
	
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//add method is overloaded
	public void add() {
		System.out.println("*********Method Overloading Demo***********");
		System.out.println("the addition of two integers is :"+ (a+b));
	}
	public void add(int x) {
		System.out.println("the addition of single number to itself is :"+ (x+x));
	}
	
	public void add(int x,int y) {
		System.out.println("the addition of two integers is :"+ ( x+ y));
	}
	
	public void add(int x,float y) {
		System.out.println("the addition of one integer and float number is :"+ ( x+ y));
	}
	
	public void add(String x,String y) {
		System.out.println("the addition of two strings is :"+ ( x+ y));
	}
	
	public void add(double x,double y) {
		System.out.println("the addition of two float numbers is :"+ ( x+ y));
	}
	
	public void add(int x,int y,int z) {
		System.out.println("the addition of two integers is :"+ ( x+ y+z));
	}

}
