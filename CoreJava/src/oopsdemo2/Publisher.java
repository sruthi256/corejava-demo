package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 29 Oct 2024
* Time   : 10:15:57 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* aggregation exampe
*/

public class Publisher {
	
	String name;
	  String publisherID;
	  String city;
	  
	public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", publisherID=" + publisherID + ", city=" + city + "]";
	}

}
