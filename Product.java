import java.util.*;

public class Product {
	private String name, category;
	private double priceMax,priceMin,price;
	private int quantity;
	private Store store;

	public Product(String name, String category, double priceMin, double priceMax) {
		this.name = name;
		this.category = category;
		this.priceMin = priceMin;
		this.priceMax = priceMax;
		this.store = null;
		this.quantity = null;
		this.price = null;
	}

	public void addToStore(Store store) {
		this.store = store;
	}
}