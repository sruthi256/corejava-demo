package tollbooth;

/**
* Author : Kopparapu.Sruthi
* Date   : 11 Nov 2024
* Time   : 9:51:33 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class TestTollBooth {

	public static void main(String[] args) {
		Tollbooth booth = new AlleghenyTollBooth();
		 
		Truck ford = new FordTruck(5, 12500); // 5 axles and 12500 kilograms
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000 kg
		Truck daewoo = new DaewooTruck(6, 17000); // 6 axles and 17000 kg
 
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		booth.calculateToll(daewoo);
 
		booth.collectReceipts();
	}

	}


