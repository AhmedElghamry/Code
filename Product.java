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
