package controlflow;

import java.util.Scanner;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 24 Oct 2024
 * Time   : 12:50:10 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * 
 * Program to display Shirt size using switch -case
 */

public class SwitchDemo3 {

	public static void main(String[] args) {
		int number;
		String size;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Your Shirt Size :");
		number=scanner.nextInt();
		scanner.close();

		//switch block to check size of shirt
		switch (number) {
		//Common block for multiple cases
		case 1:
		case 2:
		case 3: size="Kids";
		break;
		case 29: size="Small";
		break;
		case 40: size="Medium";
		break;
		case 42: size="Large";
		break;
		case 44: size="Extra Large";
		break;
		default:size="UnKnown";
		break;
		}
		System.out.println("The Shirt Size for "+number+" is : "+size);
	}

}
