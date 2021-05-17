import java.util.*;

public class StoreOwner extends User {
	
	private List storesList;
	
	public StoreOwner(String name, String password, String email) {
		super(name,password,email);
		this.storesList = new LinkedList<Store>();
	}

	public Store addStore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the store: ");
		String name = sc.nextLine();
		System.out.println("Enter the location of the store: ");
		String location = sc.nextLine();
		System.out.println("Enter the type of the store: ");
		String type = sc.nextLine();
		Store store = new Store(name,location,type,this);
		storesList.add(store);
		return store;
	}

	public void addProduct(ProductsList products) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your desired store name: ");
		String name = sc.nextLine();
		while (getStore(name) == null) {
			System.out.println("\nNo such Store. Enter your desired store name: ");
			name = sc.nextLine();
		}
		Product product = selectProduct(products);
		System.out.println("\nEnter the quantity of the product: ");
		int quantity = sc.nextInt();
		System.out.println("\nEnter the price of the product: ");
		double price = sc.nextDouble();
		for (Iterator i = storesList.iterator(); i.hasNext(); ) {
			Store s = (Store) i.next();
			if (s.getName().equals(name)) {
				product.addToStore(s,quantity,price);
				s.addProduct(product);
				return;
			}
		}


	}

	public Store getStore(String name) {
		for (Iterator i = storesList.iterator(); i.hasNext(); ) {
			Store store = (Store) i.next();
			if (store.getName().equals(name)) {
				return store;
			}
		}
		return null;
	}

	public List getStoreList() {
		return storesList;
	}	
}