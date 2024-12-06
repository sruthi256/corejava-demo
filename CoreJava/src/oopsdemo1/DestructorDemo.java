package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 4:49:01 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/


//Object class is a parent class of all java classes
class Test{
	
    //implement finalize() Method of object class
	//Destructor method - destroys object
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object destroyed and garbage collected");
	}
	
}
public class DestructorDemo {
	

	public static void main(String[] args) {
		//invokes default constructor
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		Test t4= new Test();
		
		//Deallocate memory - objects destroyed explicitly
		t1=null;
		t2=null;
		t3=null;
		
		System.gc(); // Invokes service method gc(), which in-turn invokes finalize method
		

	}

}
