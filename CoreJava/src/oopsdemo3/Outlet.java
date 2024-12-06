package oopsdemo3;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 29 Oct 2024
 * Time   : 12:41:44 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class Outlet {
	private String[] productNames;
	private double[] productPrices;
	private int[] productQuantities;
	private String[] productCategories;


public Outlet() {
	productNames = new String[100];
	productPrices=new  double[100];
	productQuantities= new int[100];
	productCategories= new String[100];

}
//Methods
private boolean isProductExists(String name) {
  for (int i = 0; i < productNames.length; i++) {
      if (productNames[i] != null && productNames[i].equals(name)) {
          return true;
      }
  }
  return false;
}

private void updateInventory(String name, double price, int quantity) {
  for (int i = 0; i < productNames.length; i++) {
      if (productNames[i] == null) {
          productNames[i] = name;
          productPrices[i] = price;
          productQuantities[i] += quantity;
          break;
      } else if (productNames[i].equals(name)) {
          productPrices[i] = price;
          productQuantities[i] += quantity;
          break;
      }
  }
  // For demonstration, assume the inventory is updated in a database
  System.out.println("Inventory updated for product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
}

private void categorizeProduct(String name, String category) {
  for (int i = 0; i < productNames.length; i++) {
      if (productNames[i] != null && productNames[i].equals(name)) {
          productCategories[i] = category;
          break;
      }
  }
  // For demonstration, assume the product category is updated in a database
  System.out.println("Product categorized: " + name + " under " + category);
}

//Overload addProduct() Method
//Method to add a product with only name & price
public void addProduct(String name,double price){
  if (!isProductExists(name)) {
      System.out.println("Added product: " + name + ", Price: $" + price);
      updateInventory(name, price, 1); //Invokes updateInventory() method
  } else {
      System.out.println("Product already exists: " + name);
      //updateInventory(name, price, 1);
  }
}

//Method to add a product with name, price & quantity
public void addProduct(String name,double price,int quantity) {
  if (!isProductExists(name)) {
      System.out.println("Added product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
      updateInventory(name, price, quantity);
  } else {
      System.out.println("Product already exists: " + name);
     // updateInventory(name, price, quantity);
  }
}

//Method to add a product with name, price , quantity & category
public void addProduct(String name,double price,int quantity,String category) {

  if (!isProductExists(name)) {
      System.out.println("Added product: " + name + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category);
      updateInventory(name, price, quantity);
      categorizeProduct(name, category);
  } else {
      System.out.println("Product already exists: " + name);
      //updateInventory(name, price, quantity);
      //categorizeProduct(name, category);
  }
}


}