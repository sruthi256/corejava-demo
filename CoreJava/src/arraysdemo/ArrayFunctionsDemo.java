package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 12:26:10 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Java Program to demonstrate in-bult functions of Arrays
* In java Array is considered Object. So there are various predefined functions
*/

public class ArrayFunctionsDemo {

	public static void main(String[] args) {
		int[] n1={22,45,47,12,12,-2};
        int[] n2=new int[5];
        int[] n3=new int[n1.length];

        System.out.println("n1 Array Contents : ");
        for (int k:n1){
            System.out.print(k+"\t");
        }
        System.out.println();

        //ArrayCopy() method to copy array contents from n1 to n3
        System.arraycopy(n1,0,n3,0,n1.length);
        System.out.println("n3 Array contents after Copying: "+ Arrays.toString(n3));

        //Copy Array Contents Partially
        System.arraycopy(n1,0,n2,1,3);
        System.out.println("n2 Array contents after Partial Copying: "+ Arrays.toString(n2));

        //Copying Small Arrays- copyOf() method
        int[] copyOfn1=Arrays.copyOf(n1,n1.length);
        System.out.println("New Array contents after  Copying: "+ Arrays.toString(copyOfn1));

        //Sort Array - Quick Sort Algorithm
        Arrays.sort(n3);
        System.out.println("n3 Array contents after Sorting :"+ Arrays.toString(n3));

        System.out.println("************* Binary Search **************");
        Arrays.sort(copyOfn1); //Array needs to be sorted for binarySearch() Operation
        System.out.println("New Array Contents : "+Arrays.toString(copyOfn1));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Element to be Searched :");
        int number = scanner.nextInt();

        //returns index of number. If duplicates are there it will give index of any one number
        //standardlibray /predefined methods
        int index=Arrays.binarySearch(copyOfn1,number);
        if(index >= 0)
            System.out.println("The Number "+number+" found at Position : "+index);
        else
            System.out.println("Number Not Found");

        System.out.println("*********** fill() method ***********");
        Arrays.fill(n2,1000);
        System.out.println("n2 Array contents after after fill() Method :"+Arrays.toString(n2));

	}

}
