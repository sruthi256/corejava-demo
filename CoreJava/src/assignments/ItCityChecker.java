package assignments;

import java.util.Scanner;

/*
 * Java Program to check whether entered City is IT City or Not. 
 * Consider Delhi, Mumbai, Kolkatta, Bangalore, Chennai , Hyderabad as IT cities.
 */

public class ItCityChecker {

	public static void main(String[] args) {
		String city;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a City Name : ");
		city=s.next();
		
		//use equals() method for comparison of Strings.(Reference type)
		//use == operator for comparison primitive types
		if(city.equalsIgnoreCase("Bengaluru") || city.equalsIgnoreCase("Chennai") || 
				city.equalsIgnoreCase("hyderabad") || city.equalsIgnoreCase("Gurgaon")) 
		{
			System.out.println(city+" is a IT City");
		}
		else
		{
			System.out.println(city+" is Not a IT City");
		}


		

	}

}
