package shoppingbag;

public class TestMainFunc {

	public static void main(String[] args)
	{
		// Plastic shopping bag
		Grocery grocery = new Grocery();
		Products p1 = new Products("Noodles", (float)250.5);
		Products p2 = new Products("Tang", (float)50);
		
		grocery.addProduct(p1);
		grocery.addProduct(p2);
		
		grocery.shoppingBag(new PlasticBagStrategy()); //Placing the products in the shopping bag
		
		// Paper shopping bag
		Grocery grocery2 = new Grocery();
		Products p3 = new Products("Surf Excel", (float)350);
		Products p4 = new Products("DairyMilk", (float)25);
		Products p5 = new Products("KitKat", (float)50);
		grocery2.addProduct(p3);
		grocery2.addProduct(p4);
		grocery2.addProduct(p5);
		grocery2.removeProduct(p4); // Removed a product
		grocery2.shoppingBag(new PaperBagStrategy());
		
		// Reusable shopping bag
		Grocery grocery3 = new Grocery();
		Products p6 = new Products("Cat food", (float)695);
		grocery3.addProduct(p6);
		grocery3.shoppingBag(new ReusableBagStrategy());
	}

}