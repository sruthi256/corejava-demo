package exceptionsdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 6 Nov 2024
 * Time   : 2:59:52 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 * Note: A Program might throw Multiple Exceptions
 * Program to handle Exception(s) using Multiple Catch Blocks
 */

public class MultipleCatchDemo {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int result = 0;
		int[] arr = new int[5];

		try{ //This block might throw multiple Exceptions
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3;
			arr[4] = 4;
			//arr[5] = 5; // Uncomment this line & execute

			System.out.println("Array Contents : "+ Arrays.toString(arr));

			System.out.println("Input two integers :");
			int num1 =input.nextInt();
			int num2 = input.nextInt();

			result = num1 / num2;
			System.out.println("Result of Division : " + result);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.err.println(e);
		}
		catch (ArithmeticException e){
			System.err.println(e);
		}
		catch (NumberFormatException e){
			System.err.println(e);
		}
		catch (Exception e){ //General Exception
			System.err.println(e);
		}
		finally {
			System.out.println("In Finally Block");
		}

	}

}
