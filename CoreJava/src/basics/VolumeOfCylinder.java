package basics;

import java.util.Scanner;

// program to find the volume of cylinder
public class VolumeOfCylinder {

	public static void main(String[] args) {
		float r,h,vol;
		final float PI = 3.14f;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius of a Cylinder :");
		r= scan.nextFloat();
		System.out.println("Enter height of a Cylinder :");
		h=scan.nextFloat();
		vol= PI *r*r*h;
		System.out.println("vol of cylinder :" + vol);
		
		scan.close();

	}

}
