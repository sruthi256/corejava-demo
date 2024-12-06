package controlflow;

/**
* Author : Kopparapu.Sruthi
* Date   : 24 Oct 2024
* Time   : 2:41:44 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* displaying numbers from 1 to 10 and 10 to 1
* display name 10 times
*/

public class Disp1to10 {

	public static void main(String[] args) {
		//loop initialization
		int i = 1;
		
		//set condition to loop
		while(i<11) {
			System.out.println(i+" - James Gosling");
			System.out.println("sruthi");
			i+=1;
		}
		System.out.println("**********Reverse loop**********");
		
		int j=20;
		while(j>=1) {
			System.out.print(j+"\t");
			j-=1;
		}

	}

}
