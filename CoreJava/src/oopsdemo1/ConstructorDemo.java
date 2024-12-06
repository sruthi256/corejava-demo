package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 2:36:09 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	
	
    // nor args constructor
	public ConstructorDemo() {
		System.out.println("No Args Constructor or implicit constructor");
		this.id=101;
		this.name="sruthi";
		this.salary=5000.00f;
	}
	
	//parameterised constructor
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public void name() {
		System.out.println("I am a Display Method");
		System.out.println(this.id+ " "+this.name+" "+this.salary);
	}
	



	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo(); //invokes  No-Args constructor
		ConstructorDemo cd2=new ConstructorDemo(1002,"Johnson",4200.00f);
		ConstructorDemo cd3=new ConstructorDemo();
		cd1.name();
		cd2.name();

	}

}
