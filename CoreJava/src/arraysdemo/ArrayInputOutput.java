package arraysdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 11:52:25 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to enter elements in to the array
*/

public class ArrayInputOutput {

	public static void main(String[] args) {
		// Define array reference "marks" & create array of int to hold 10 values
		
		int [] marks = new int[10];
		String [] name = {"jack","mike","mary","james","ron"};
		float [] scores;
		scores = new float[5];
		
		//Initialize array elements
		scores[0]= 34.45f;
		scores[1]=80.50f;
	    scores[2]=55.00f;
	    
	    //initialize array elements using loop
	    for(int i=0;i<marks.length;i++) {
	    	marks[i] = i*50;
	    }
	    
	    //output
	    System.out.println("*******Integer Array Contents**********");
	    for(int i=0;i<marks.length;i++) {
	    	System.out.print(marks[i]+"\t");
	    }
	    System.out.println();
	    
	    System.out.println("*********String Array Contents ************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println();
		
		System.out.println("*********Float Array Contents ************");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println();
		
		//Iterate in nonLinear
		System.out.println("*********Integer Array Contents in Even Index ************");
		for (int i = 0; i < marks.length; i=i+2) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();

	}

}
