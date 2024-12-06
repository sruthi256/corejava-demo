package java8features;

/**
* Author : Kopparapu.Sruthi
* Date   : 9 Nov 2024
* Time   : 2:57:28 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class MusicalInstrument {
	
	private String name;
	private String type;
	private double price;
	public MusicalInstrument(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	

}
