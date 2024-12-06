package oopsdemo4;

/**
* Author : Kopparapu.Sruthi
* Date   : 30 Oct 2024
* Time   : 3:29:28 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Result extends Candidate implements Exam {

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("*******Candidate Result*******");
	}

	@Override
	public void percent_cal() {
		int total = (mark1+mark2);
		float percent = total *100/200;
		System.out.println("Percentage : "+ percent+ "%");
		
	}
	
	

}
