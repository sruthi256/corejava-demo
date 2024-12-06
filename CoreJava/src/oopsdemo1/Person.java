package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 11:59:32 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Person {
	
	//attributes / state/ instance variable/properties
		 int id,age;
		 String name,city,gender;
		
		//Methods/actions/functions/behavior
		public void eat() {
			System.out.println(name+" is Eating");
		}
		
		public void study() {
			System.out.println(name+" is Studying");
		}
		
		public void sleep() {
			System.out.println(name+" is Sleeping");
		}	

	public static void main(String[] args) {
		//Create Objects of Person Class
				Person p1=new Person();
				Person p2=new Person();
				Person p3=new Person();
				
				//Input name for person Objects
				p1.name="James Gosling";
				p2.name="Gavin King";
				p3.name="Rod Johnson";
				
				//Invoke Methods
				p1.eat();
				p1.study();
				p1.sleep();
				System.out.println();
				
				p2.eat();
				p2.study();
				p2.sleep();
				System.out.println();
				
				p3.eat();
				p3.study();
				p3.sleep();
				System.out.println();
	}

}
