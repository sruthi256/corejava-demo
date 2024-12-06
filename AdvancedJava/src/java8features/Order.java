package java8features;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 9 Nov 2024
 * Time   : 10:08:56 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class Order {
	public enum Side{ BUY, SELL }; //constant array

	private  int quantity; 
	private  String symbol; 
	private  double price; 
	private  Side side;
	
	public Order(int quantity, String symbol, double price, Side side) {
		this.quantity = quantity;
		this.symbol = symbol;
		this.price = price;
		this.side = side;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public String getSymbol() {
		return symbol;
	}
	public double getPrice() {
		return price;
	}
	public Side getSide() {
		return side;
	}
	
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", symbol=" + symbol + ", price=" + price + ", side=" + side + "]";
	}

	// sorting algorithm a > b -> returns positive	value

	// if a>b == >0 , if a<b == <0 , if a==b  -->0
	
	public static int compareByQuantity(Order a, Order b){ 
		return a.quantity - b.quantity; }  //  1000 - 500 = 500 / 500 -1000 = -500

	public int compareByPrice(Order a, Order b){ 
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice())); 
	}
}
