package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 10:23:53 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class MagazineAggregationDemo {

	public static void main(String[] args) {
		Author a1=new Author ("John",42,"USA");
		Publisher p1=new Publisher("Sun Publications", "JDSR - III4", "LA");
		Magazine m1=new Magazine("The Wolf street",800,a1,p1);
		m1.display();
		  
		  /*Every Object is independent 
			     In Aggregation, both the entries can survive individually which means 
			     ending one entity will not affect the other entity.
			     */
		System.out.println();
		System.out.println(a1);
		System.out.println(p1);
		System.out.println(m1);
	

	}

}
