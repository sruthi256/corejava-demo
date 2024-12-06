package basics;

import java.util.Scanner;

/*
 * program to calculate simple interest for a loan amount
 */
public class SimpleInterest {

	public static void main(String[] args) {
		
		String customername;
		double principal;
		float si,rate;
		int term;
		
		//create scanner object for taking inputs
		Scanner scan = new Scanner(System.in);
		
		//input
		System.out.println(" Simple interest calculation ");
		System.out.println("Enter the name of the customer: ");
		customername= scan.nextLine();
		System.out.println("Enter the loan amount :");
		principal=scan.nextDouble();
		System.out.println("Enter loan term : ");
		term = scan.nextInt();
		System.out.println("enter rate of interest : ");
		rate = scan.nextFloat();
		
		//calculate si
		si = (float) (principal*term*rate)/100;
		
		//output
		System.out.println("*******loan details********");
		System.out.println("Customer Name    : "+ customername);
		System.out.println("Principal Amount : "+ principal);
		System.out.println("Term             :"+ term);
		System.out.println("Rate             :"+rate);
		System.out.println("simple interest  :"+ si);

		scan.close();
	}

}
