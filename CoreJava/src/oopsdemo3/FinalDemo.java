package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 9:39:52 am
* Email  : Kopparapu.Sruthi@coforge.com
*/
class MyDemo{
	private static final int MAX_AGE=65; //final variable
	private int age=21;
	
	public void test() {
		MAX_AGE=60; //final variables cannot modified
	}
	
	public final void test1() {
		System.out.println("The age is : "+age);
	}
}

class MyTemp extends MyDemo{
	public final void test1() { // final methods cannot be overriding
		System.out.println("The age is : "+age);
	}
}

final class hello{
	int a,b;

	public hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello [a = " + a + " , b="+b+ "]";
	}
	
class World extends Hello{ //final classes cannot be extended
	
}

}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
