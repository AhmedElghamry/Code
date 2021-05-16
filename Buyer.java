import java.util.*;

public class Buyer implements User {

	public Buyer(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public void buy(ProductsList products) {
		Product selectedProduct = this.selectProduct(ProductsList products);
		int quantity = selectQuantity();
		String address = selectAddress();
		if(!Agree()) { return; }
		Confirm();
	}

	private Product selectProduct(ProductsList products) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite the name of your desired product: ");
		String name = sc.nextLine();
		while (products.getProduct(name) == null ) {
			System.out.println("\nThere is no Product with that name. Please, type again the name of your desired product: ");
			name = sc.nextLine();
		}
		return products.getProduct(name);
	}

	private int selectQuantity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite the quantity of your desired product: ");
		return sc.nextInt();
	}

	private String selectAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite the quantity of your shipping address: ");
		return sc.nextLine();
	}

	private boolean Agree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDo you agree on the terms and conditions of this product? y/n\n");
		if (sc.nextLine() == "y") { return true; }
		else { return false; }
	}

	private boolean Confirm(Product product, int quantity, String address) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDo you Confirm the following provided information? y/n\n Product Name: " + product.getName() + "\nQuantity: " + quantity + "\nAddress: " + address + "\n");
		if (sc.nextLine() == "y") { System.out.println("You have sucessfully bought your desired product.\n"); return true; }
		else { return false; }		
	}
}