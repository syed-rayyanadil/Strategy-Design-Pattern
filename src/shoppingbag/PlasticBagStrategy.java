package shoppingbag;
import java.util.List;
import java.util.ArrayList;

public class PlasticBagStrategy implements ShoppingBagStrategy
{
	private double bagPrice;
	List<Products> products = new ArrayList<Products>();
	
	public PlasticBagStrategy() {
		bagPrice = 2;
	}
	
	
	public void shoppingBag(List<Products> products, double tot)
	{
		this.products = products;
		System.out.println("Grocery products placed in Plastic Shopping Bag! Your New total is: "+(tot+bagPrice)+"\n");
	}

}
