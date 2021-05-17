import java.util.*;

public class Store {
	private String name, location, type;
	private ProductsList products;
	private StoreOwner storeOwner;

	public Store(String name, String location, String type, StoreOwner storeOwner) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.storeOwner = storeOwner;
		this.products = new ProductsList();
	}
	public void addProduct(Product product) {
		products.addProduct(product);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public StoreOwner getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(StoreOwner storeOwner) {
		this.storeOwner=storeOwner;
	}
	public ProductsList getProductsList() {
		return products;
	}
	public void setProductsList(ProductsList products){
		this.products=products;
	}
}