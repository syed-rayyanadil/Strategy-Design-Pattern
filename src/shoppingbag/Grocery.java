package shoppingbag;
import java.util.ArrayList;
import java.util.List;

public class Grocery 
{
	private List<Products> products;
	public static double tot;
	
	// Grocery class constructor
	public Grocery()
	{
		this.products = new ArrayList<Products>();
		tot = 0;
	}
	
	// Adding products to the List products
	public void addProduct(Products product)
	{
		this.products.add(product);
	}
	
	// Removing products from the List products
	public void removeProduct(Products product)
	{
		this.products.remove(product);
	}
	
	// This function returns the List containing all grocery products
	public List<Products> groceryList()
	{
		return products;
	}
	
	// Calculating the total amount of all products only
	public double totalAmountProducts() {
//		tot = 0;
		for(Products prod : products)
		{
			tot = tot + prod.getProductPrice();
		}
		return tot;
	}
	
	public void shoppingBag(ShoppingBagStrategy bagType)
	{
		bagType.shoppingBag(groceryList(),totalAmountProducts());
	}
}