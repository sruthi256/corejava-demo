package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 11:56:24 am
* Email  : Kopparapu.Sruthi@coforge.com
*  Calculate total pay for Manager & Directors using abstraction
*/

public class EmployeePay {

	public static void main(String[] args) {
		Employee mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");

		double payTotal = mgrObj.totalPay();
		double less = mgrObj.deduction(5); // has take 5 leaves
		double netPay = payTotal - less;
		System.out.println("\nManager Details");
		System.out.println("===================================");
		mgrObj.show();
		System.out.println("Total Pay: \t\t" + payTotal);
		System.out.println("Net Pay: \t\t" + netPay);

		Employee dirObj = new Director("Stephen", 32400.00, "New York",8000);
		payTotal = dirObj.totalPay();
		less = dirObj.deduction(1);
		netPay = payTotal - less;
		System.out.println("\n\nDirector Details");
		System.out.println("============================");
		dirObj.show();
		System.out.println("Total Pay: \t\t" + payTotal);
		System.out.println("Net Pay: \t\t" + netPay);

		// Employee e1=new Employee(); -- compiler error - cannot instantiate abstract class Employee
	}

}
