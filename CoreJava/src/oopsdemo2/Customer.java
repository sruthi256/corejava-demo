package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 11:35:10 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* single inheritance demo for online shopping
*/

public class Customer {
	
	private String name;
	private String email;
	
	

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	   public void display(){
	        System.out.println("********** Customer Details ************");
	        System.out.println("Customer Name    : "+name);
	        System.out.println("Email            : "+email);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
