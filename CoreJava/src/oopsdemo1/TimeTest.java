package oopsdemo1;

/**
* Author : Kopparapu.Sruthi
* Date   : 26 Oct 2024
* Time   : 3:26:34 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class TimeTest {

	public static void main(String[] args) {
		Time time1=new Time(12,45,55); //invoke constructor
		Time time2= new Time(10,30,30);
		
		time1.add(time2);
		time1.display();
		
	}

}
