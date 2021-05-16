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
	
	public void setName(String category) {
		this.category=category;
	}
		
	public int getPriceMin() {
		return priceMin;
	}	
	
	public void setPriceMin(String priceMin) {
		this.priceMin=priceMin;
	}
	
	public int getPriceMax() {
		return priceMax;
	}
	
	public void setPriceMax(String priceMax) {
		this.priceMax=priceMax;
	}
	
	public Store getStore() {
		return store;
	}
	
	public void setStore(Store store) {
		this.store=store;
	}

}
