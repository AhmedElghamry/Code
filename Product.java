import java.util.*;

public class Product {
	private String name, category;
	private int priceMax,priceMin;
	private Store store;

	public Product(String name, String category, int priceMin, int priceMax) {
		this.name = name;
		this.category = category;
		this.priceMin = priceMin;
		this.priceMax = priceMax;
		this.store = null;
	}

	public void addToStore(Store store) {
		this.store = store;
	}
}