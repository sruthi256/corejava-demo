package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 12:03:34 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Java Program to demonstrate Banking Transactions using Multi-Level Inheritance
*/

//Account --> Savings Account --> AccountTransactions
public class Account {
	
	private int accountNumber;
    private String name;
    
    
    
    public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public void display() {
        System.out.println("********** Account Details ***********");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Customer Name  :"+name);
    }

}
