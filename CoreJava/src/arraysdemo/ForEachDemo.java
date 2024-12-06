package arraysdemo;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 12:10:14 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class ForEachDemo {

	public static void main(String[] args) {
		//Array declaration
		//Define array reference "marks" & Create array of int to hold 10 values
				int[] marks= {78,45,80,22,60,66,90,35,55,59};
				
				String[] name= {"Jack","Mike","Mary","James","Ron"}; //Declare fixed Array
				
				float[] scores;
				scores=new float[5]; //Array to store scores 
				
				//Initialize Array Elements -Input
				scores[0]=34.45f;
				scores[1]=80.50f;
				scores[2]=55.00f;
				scores[3]=89.00f;
				scores[4]=70.50f;
				
				//For-Each loop is used for iteration in arrays ijn sequential order
				System.out.println("Integer arrays displayed using for-each loop");
				for(int i :marks) {
					System.out.print(i+"\t");
					
				}
				System.out.println();
				System.out.println("Float array displayed using for each loop");
				for (float s:scores) {
					System.out.print(s+"\t");
					
				}
				System.out.println();

	}

}
