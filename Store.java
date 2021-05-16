import java.util.*;

public class Store {
	private String name, location, type;
	private List<Product> products;
	private StoreOwner storeOwner;

	public Store(String name, String location, String type, StoreOwner storeOwner) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.storeOwner = storeOwner;
		this.products = new LinkedList<Product>();
	}
}