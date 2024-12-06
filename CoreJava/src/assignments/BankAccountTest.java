package assignments;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 9:34:05 am
* Email  : Kopparapu.Sruthi@coforge.com
*/


import java.util.Scanner;


public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        // Get account holder name and initial balance from user
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
 
        // Create a new bank account object
        BankAccount account = new BankAccount(name, initialBalance);
 
        // Menu for banking operations
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
 
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
 
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
 
                case 3:
                    account.displayAccountInfo();
                    break;
 
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
 
                default:
                    System.out.println("Invalid option! Please choose again.");
                    break;
            }
        }
 
        scanner.close();

	}

}

