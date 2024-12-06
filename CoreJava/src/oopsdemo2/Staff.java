package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 12:38:21 pm
* Email  : Kopparapu.Sruthi@coforge.com
* 
* Program to demonstrate MultiLevel Inheritance to Calculate Salary Structure of
 * different levels of Employees
 //Staff will have salary,hra
*/

public class Staff {
	
	   private int staffId;
	    private String name;
	    protected float salary,hra; // protected variables can be accessed in Child class
	    
		public Staff(int staffId, String name, float salary) {
			this.staffId = staffId;
			this.name = name;
			this.salary = salary;
		
		}
		
		//default Methods
	    void getHRA() {
	        hra=(salary*60)/100; //Normal Staff, HRA -> 60% of Salary
	        System.out.println("HRA :"+hra);
	    }
	    void display() {
	        System.out.println(staffId+" "+name+" "+salary);
	    }
	    void printSal() {
	        System.out.println("Total Salary : "+(salary+hra));
	    }
	    
	    

}

////Manager is-a Staff
//Total salary- salary+hra+da

class Manager extends Staff{

	//Properties
	    protected float da;
	    private float gross;

	public Manager(int staffId, String name, float salary) {
		super(staffId, name, salary);
	}
	//methods
    void getDA() {
        da=(salary*60)/100; //da is 60% of salary for Managers
        System.out.println("Dearness Allowance : "+da);
    }
    //methods
    void print() {
        gross=salary+hra+da;
        System.out.println("Total Salary of Manager : "+gross);
    }	
	
}

//Staff --> Manager --> Director - MultiLevel Inheritance
//DIrector Total sal = salary+hra+da+ta

class Director extends Manager{
	
	private float ta,gross;

	public Director(int staffId, String name, float salary) {
		super(staffId, name, salary);
	}
	
	void getTA() {
        ta=(salary*30)/100;
        System.out.println("Travelling Allowance : "+ta);
    }
    void print() {
        gross=salary+hra+da+ta;
        System.out.println("Total Salary of Director : "+gross);
    }	
	
}
