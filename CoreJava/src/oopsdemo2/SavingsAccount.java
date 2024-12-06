package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 12:06:36 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class SavingsAccount extends Account{

	private float minimumBalance;
	protected double balance;

	public SavingsAccount(int accountNumber, String name , float minimumBalance, double balance) {
		super(accountNumber, name);
		this.minimumBalance= minimumBalance;
		this.balance=balance;
		
	}
	
	public void display() {
        super.display(); // invokes display method from super class
        System.out.println("Minimum Balance         :"+minimumBalance);
        System.out.println("Savings Account Balance :"+balance);
    }


}
