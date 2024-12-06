package java8features;

import java.time.LocalDate;

/**
* Author : Kopparapu.Sruthi
* Date   : 9 Nov 2024
* Time   : 11:21:11 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

// java8 allows to add functionality to interfaces
interface Parser{
	
	default void parse() {
		System.out.println("Default Parsing logic ");
	}
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser{
	
	//inherit default implementation of parse
	
	void display() {
		System.out.println("Hello Text Parser");
	}
}

class XMLParser implements Parser{
	
	//overridden method
	public void Parse() {
		System.out.println("Parsing XML Files");
	}
}
public class DefaultMethodDemo1 {

	public static void main(String[] args) {
		Parser p = new TextParser();// up casting
		p.parse(); //invoke default method in interface
		
		TextParser p1 = new TextParser();// references child class textparser
		p1.display();
		
		p = new XMLParser(); //references child class XMLparser
		p.parse(); //invoke overridden method
		
		System.out.println("Program executed on : ");
		Parser.displayDate(); //invoke static method

	}

}
