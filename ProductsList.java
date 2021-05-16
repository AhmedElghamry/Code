import java.util.*;

public class ProductsList {
	private List Products;
	
	public ProductsList() {
		Products = new LinkedList<Product>();
	}
	
	public void addProduct(Product product) {
		Products.add(product);
	}
	
	public Product getProduct(String name) {
		for (Iterator i = Products.iterator(); i.hasNext(); ) {
			Product product = (Product) i.next();
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
	/*public ProductsList search(String name, String rule) {
		ProductsList matchingProducts = new ProductsList();
		for (Iterator i = Products.iterator(); i.hasNext(); ) {
			Product product = (Product) i.next();
			if (product.getName().matches(ruleName, rule))
				matchingProducts.add(product);
		}
		return matchingGames;
	}*/
}