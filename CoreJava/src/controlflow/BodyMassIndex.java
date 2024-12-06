package controlflow;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 24 Oct 2024
 * Time   : 9:31:08 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class BodyMassIndex {

	public static void main(String[] args) {
		float height,weight,BMI;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your Height : ");
		height=scan.nextFloat();
		System.out.println("Enter your weight : ");
		weight=scan.nextFloat();
		BMI=weight/(height*height);
		
		System.out.println("Your BMI is : "+ BMI);
		

	}

}
