package shoppingbag;

import java.util.ArrayList;
import java.util.List;

public class ReusableBagStrategy implements ShoppingBagStrategy
{
	private double bagPrice;
	List<Products> products = new ArrayList<Products>();
	
	public ReusableBagStrategy() {
		bagPrice = 10;
	}
	
	
	public void shoppingBag(List<Products> products, double tot)
	{
		this.products = products;
		System.out.println("Grocery products placed in Reusable Shopping Bag! Your New total is: "+(tot+bagPrice)+"\n");
	}


}
