package oopsdemo3;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 2:43:34 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class OverrideDemo {

	public static void main(String[] args) {
		SBI sbibank = new SBI("SBI");
		axis axisbank = new axis("AXIS");
		icici icicibank= new icici("ICICI");
		
		sbibank.display(); // invokes base class method
		//invokes overridden method
		System.out.println("\tThe interest rate is : "+sbibank.getRateofInterest());
		
		icicibank.display(); // invokes base class method
		//invokes overridden method
		System.out.println("\tThe interest rate is : "+icicibank.getRateofInterest());
		
		axisbank.display(); // invokes base class method
		//invokes overridden method
		System.out.println("\tThe interest rate is : "+axisbank.getRateofInterest());

	}

}
