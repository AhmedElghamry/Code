import java.util.*;

public class ProductsList {
	private List Products;
	
	public ProductsList() {
		Products = new LinkedList<Product>();
	}
	
	public void addProduct(Product product) {
		Products.add(product);
	}
	
	public Game getProduct(String name) {
		for (Iterator i = Products.iterator(); i.hasNext(); ) {
			Product product = (Product) i.next();
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
	/*public List search(String ruleName, String rule) {
		List matchingGames = new LinkedList();
		for (Iterator i = Games.iterator(); i.hasNext(); ) {
			Game game = (Game) i.next();
			if (game.getRules().matches(ruleName, rule))
				matchingGames.add(game);
		}
		return matchingGames;
	}*/
}