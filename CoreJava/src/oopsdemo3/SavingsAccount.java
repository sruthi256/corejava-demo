package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 3:40:58 pm
* Email  : Kopparapu.Sruthi@coforge.com
* class for savings account operations - same as normal account
*/

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}
	
	//generate getters
	public double getInterestRate() {
		return interestRate;
	}
	

}
