package assesment2;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 4 Nov 2024
 * Time   : 10:52:02 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class RotateArray {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array elements :");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int k;
		System.out.println("enter the number of times you want to rotate :");
		k=sc.nextInt();
	
		for(int i=arr.length-k;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
 
		
		for(int i=0;i<=arr.length-k-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
 
}
}
 