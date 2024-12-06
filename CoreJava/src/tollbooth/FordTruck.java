package tollbooth;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 11 Nov 2024
 * Time   : 9:44:21 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class FordTruck implements Truck{


	private int axles;
	private double weight;
	
	
	public FordTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}
 
 
	@Override
	public int getAxles() {
		
		return axles;
	}
 
 
	@Override
	public double getWeight() {
	
		return weight;
	}
 
 
	@Override
	public String getbrand() {
		return "daewoo";
	}
}