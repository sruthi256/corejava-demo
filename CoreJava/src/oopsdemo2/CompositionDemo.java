package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 11:22:21 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

class Hyundai extends Car{
	public void hyundaiStart()
	{
		Engine heng=new Engine();
		heng.startEngine();
	}
	
}

class Maruti extends Car{
	public void MarutiStart()
	{
		Engine meng=new Engine();
		meng.startEngine();
	}
	
}
public class CompositionDemo {

	public static void main(String[] args) {
		Maruti baleno =new Maruti();
		
		baleno.setColor("Silver"); //car class methods
		baleno.setMax_speed(180);	//car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods
		
		baleno.MarutiStart(); // Maruti class method-- > call ENgine class method
		
		baleno=null; // baleno object destroyed along with engine object
		System.gc();
		baleno.MarutiStart();
		//System.out.println(baleno.getColor());
		
		Hyundai creta = new Hyundai();

	}

}
