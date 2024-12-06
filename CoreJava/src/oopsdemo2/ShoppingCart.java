package oopsdemo2;

/**
* Author : Kopparapu.Sruthi
* Date   : 28 Oct 2024
* Time   : 11:39:30 am
* Email  : Kopparapu.Sruthi@coforge.com
* 
* //Child class of Customer for Managing Cart
*/

public class ShoppingCart extends Customer{
	
	private String[] items;
	private int itemCount;

	public ShoppingCart(String name, String email) {
		super(name, email);
		items=new String[5]; //max 5 items can be added to the cart
		itemCount=0;
		// TODO Auto-generated constructor stub
	}
	
	public void addItem(String item){
        if(itemCount < items.length){
            items[itemCount]=item;
            itemCount++;
            System.out.println(item+" Added to Cart");
        }else {
            System.out.println("Cart is Full. Cannot Add More Items.");
        }
    }

    public void displayCart(){
        System.out.println("Items in Cart: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("\t"+items[i]);
        }
    }

}
