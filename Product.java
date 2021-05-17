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
		this.quantity = 0;
		this.price = 0;
	}

	public void addToStore(Store store, int quantity, double price) {
		this.store = store;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
		
	public double getPriceMin() {
		return priceMin;
	}	
	
	public void setPriceMin(double priceMin) {
		this.priceMin=priceMin;
	}
	
	public double getPriceMax() {
		return priceMax;
	}
	
	public void setPriceMax(double priceMax) {
		this.priceMax=priceMax;
	}
	
	public Store getStore() {
		return store;
	}
	
	public void setStore(Store store) {
		this.store=store;
	}

}
