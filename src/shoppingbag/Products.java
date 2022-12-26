package shoppingbag;

public class Products 
{
	private String productName;
	private double productPrice;
	
	public Products(String name, float price)
	{
		this.productName = name;
		this.productPrice = price;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getProductPrice()
	{
		return productPrice;
	}
}
