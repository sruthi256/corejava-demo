package controlflow;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 25 Oct 2024
* Time   : 9:19:37 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* program to count vowels in string
*/

public class VowelsCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence;
		System.out.println("Enter a sentence : ");
		sentence=scan.nextLine();
		String sentence1=sentence.toLowerCase();
		int count =0;
		scan.close();
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence1.charAt(i)== 'a'||sentence1.charAt(i)== 'e'|| sentence1.charAt(i)=='i' || sentence1.charAt(i)=='o' || sentence1.charAt(i)=='u')
			{
				count+=1;
				
			}
		}
		System.out.println("Total number of vowels in\"" + sentence + "\" is :"+count);
		
	}

}
