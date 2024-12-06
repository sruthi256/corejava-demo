package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */
public class Discount {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(is);
		
		String name;
		int age;
		boolean isMember;
		
		//Ask user for membership status
		
		System.out.println("Enter your name : ");
		name = br.readLine();
		System.out.println("Enter your age : ");
		age= Integer.parseInt(br.readLine());
		System.out.println("Are you a member ? : (true/false)");
		isMember= Boolean.parseBoolean(br.readLine());
		
		//check user is eligible for discount or not
		if(age<18 || !isMember) {
			System.out.println(name + " is eligible for discount!!!");
		}
		else {
			System.out.println(name + " is not eligible for discount!!!");
		}

	}

}
