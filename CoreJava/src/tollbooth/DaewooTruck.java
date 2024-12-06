package tollbooth;

/**
* Author : Kopparapu.Sruthi
* Date   : 11 Nov 2024
* Time   : 9:38:12 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class DaewooTruck implements Truck{
	private final int axles;
	private final int weight;
	
	
	public DaewooTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}
 
 
	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}
 
 
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
 
 
	@Override
	public String getbrand() {
		// TODO Auto-generated method stub
		return "Daewoo";
	}

}
