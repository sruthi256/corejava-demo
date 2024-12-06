package java8features;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 9 Nov 2024
 * Time   : 11:43:15 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class DefaultMethodDemo2 {

	public static void main(String[] args) {

		Vehicle car=new Car("Audi");

		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		// invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());

		//invoke static method of Interface
		System.out.println(Vehicle.getHorsePower(2500, 400));

	}

}
