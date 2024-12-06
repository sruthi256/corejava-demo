package oopsdemo2;

import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 12:21:25 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Java Program to demonstrate Banking Transactions using Multi-Level Inheritance
*/

public class BankingApplication {

	public static void main(String[] args) {
	      Scanner scanner=new Scanner(System.in);
	        System.out.println("********** Welcome to Soft Bank ************");

	        System.out.println("Enter Account Number & Customer Name:");
	        int accountNumber=scanner.nextInt();
	        String name=scanner.nextLine();

	        //Constant declaration
	        final float MIN_BAL=1000;
	        final double BALANCE=5000; // Initial Balance while creating SavingsAccount

	        System.out.println("Enter Amount to be Deposited : ");
	        double deposit=scanner.nextDouble();
	        System.out.println("Enter Amount to Withdrawal :");
	        double withdrawal=scanner.nextDouble();

	        //Create Object of AccountTransactions
	        AccountTransactions transactions1,transactions2;

	        transactions1=new AccountTransactions(accountNumber,name,MIN_BAL,BALANCE,withdrawal,deposit);
	        transactions2 =new AccountTransactions(9999,"Mary Smith",MIN_BAL,BALANCE,7000,5000);

	        transactions1.display();
	        transactions2.display();
	        scanner.close();

	}

}
