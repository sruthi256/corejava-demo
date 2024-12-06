package oopsdemo3;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 29 Oct 2024
 * Time   : 3:52:18 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 * Main class to perform Transactions on Savings & Checking Account Operations
 * & understand concept of Dynamic Polymorphism

 */

public class AccountOperations {

	public static void main(String[] args) {

		Account account;

		//Upcasting
		account=new SavingsAccount("John Micheal",5000, 4);

		System.out.println("\nSavings Account Details");
		System.out.println("------------------------");
		System.out.println("" + account.getName()+ " has an initial Balance of: " + account.getBalance());
		account.deposit(2000);//invokes base class methods
		account.withdraw(3000);// invokes base class methods
		System.out.println("" + account.getName()+ " at the end of transaction has a Balance of: "
				+ account.getBalance());

		//double i = account.getInterestRate(); //We cannot access methods of child class
		//Downcasting - To access Child class Methods
		if( account instanceof SavingsAccount) {
			SavingsAccount savingsAccount=(SavingsAccount) account; //Downcasting - Parent to child
			double i =savingsAccount.getInterestRate();
			System.out.println("The Interest Rate for Savings Account is : "+i);
		}


		//Upcasting
		account =new CheckingAccount("Mary Thomas",10000, 5000); //Checking a/c with OD facility

		System.out.println("\nChecking Account Details");
		System.out.println("-------------------------------");

		System.out.println("" + account.getName()+ " has an initial Balance of: " + account.getBalance());
		account.deposit(2000); // invokes base class methods
		account.withdraw(15000); //invokes overridden method of derived class
		System.out.println("" + account.getName()+ " at the end of transaction has a Balance of: "
				+ account.getBalance());

		account =new CheckingAccount("Navin Kumar",10000, 5000); //Checking a/c with OD facility

		System.out.println("\nChecking Account Details");
		System.out.println("-------------------------------");

		System.out.println("" + account.getName()+ " has an initial Balance of: " + account.getBalance());
		account.deposit(2000); // invokes base class methods
		account.withdraw(25000); //invokes overridden method of derived class
		System.out.println("" + account.getName()+ " at the end of transaction has a Balance of: "
				+ account.getBalance());

	}

}
