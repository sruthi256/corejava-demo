package tollbooth;

/**
* Author : Kopparapu.Sruthi
* Date   : 11 Nov 2024
* Time   : 9:35:01 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class AlleghenyTollBooth implements  Tollbooth{
	private int totalTrucks;
	private int totalReceipts;
	public void calculateToll(Truck truck) {
		double toll = 5 * truck.getAxles() + 10 * (truck.getWeight() / 500);
		totalReceipts += toll;
		totalTrucks++;
		System.out.println("Arrival of " + truck.getbrand() + " Truck");
		System.out.println("Truck arrival - Axles: " + truck.getAxles() + " Total weight: "
				+ truck.getWeight() + " Toll due: $" + toll);
		
 
	}
	@Override
	public void displayData() {
		System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
		
	}
	@Override
	public void collectReceipts() {
		System.out.println("*** Collecting receipts ***");
		displayData();
		totalReceipts = 0;
		totalTrucks = 0;
		System.out.println("***** Reset Receipts *****");
		displayData();
		
	}

}
