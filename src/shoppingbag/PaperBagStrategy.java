package shoppingbag;
import java.util.ArrayList;
import java.util.List;

public class PaperBagStrategy implements ShoppingBagStrategy
{
	private double bagPrice;
	List<Products> products = new ArrayList<Products>();
	
	public PaperBagStrategy() {
		bagPrice = 5;
	}
	
	
	public void shoppingBag(List<Products> products, double tot)
	{
		this.products = products;
		System.out.println("Grocery products placed in Paper Shopping Bag! Your New total is: "+(tot+bagPrice)+"\n");
	}


}
