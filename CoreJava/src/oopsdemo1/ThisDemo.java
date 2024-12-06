package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 12:40:47 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ThisDemo {
	private int number;
	private String text;
	
	//Default Constructor - 
			//Compiler Creates it for Automatic initialization of Object Properties
	
	//This keyword refers to Current Object calling the Method
    public void setValues(int number, String text) {
		this.number=number;
		this.text=text;
	}
  
  
  
  public void display() {
		System.out.println("Number : "+this.number);
		System.out.println("Text   : "+this.text);
	}

	public static void main(String[] args) {
		ThisDemo demo1=new ThisDemo();
		ThisDemo demo2 = new ThisDemo();
		demo1.setValues(100, "Java programming ");
		demo2.setValues(200, "Spring Programming ");
		
		demo1.display();
		demo2.display();
	}

}
