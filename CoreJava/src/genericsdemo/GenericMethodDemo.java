package genericsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 5 Nov 2024
* Time   : 11:53:38 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class GenericMethodDemo {
	
	//generic method
	public static <E> void printArray(E[] inputArray) {
		
		for (E element:inputArray) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer [] intArray = {1,2,3,4,5};
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	}

}
