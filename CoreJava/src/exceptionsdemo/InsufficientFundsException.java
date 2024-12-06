package exceptionsdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 6 Nov 2024
* Time   : 4:35:51 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/
// define  custom exception class to handle insufficient funds in bank
public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;
	

	public InsufficientFundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	public InsufficientFundsException() {
		// TODO Auto-generated constructor stub
	}




}
