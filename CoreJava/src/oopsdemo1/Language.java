package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 4:12:35 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* constructo overloading - constructor with diff parameters
*/

public class Language {
	
	private String name;
	private float version;
//no args constructor
	public Language() {
		this.name= "Java";
		this.version=8.0f;
		System.out.println("The language is : "+this.name+ "- V"+this.version);
	}
	//constructor with one float parameter	
public Language(float version) {
		this.version = version;
		this.name="Python";
		System.out.println("The language is : "+this.name+ "-"+ "V"+this.version);
	}
//constructor with 2 parameters
public Language(String name, float version) {
	this.name = name;
	this.version = version;
	System.out.println("The language is : "+this.name+ "- V"+this.version);
}

//constructor with one string parameter
	public Language(String name) {
		this.name = name;
		this.version=5.0f;
		System.out.println("The language is : "+this.name+ "- V"+this.version);
	}


}
