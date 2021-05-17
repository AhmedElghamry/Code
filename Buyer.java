import java.util.*;

public class Buyer extends User {

	public Buyer(String name, String password, String email) {
		super(name,password,email);
	}

	public void buy(ProductsList products) {
		Product selectedProduct = this.selectProduct(products);
		int quantity = selectQuantity();
		String address = selectAddress();
		if(Agree()) {
			while(!Confirm(selectedProduct,quantity,address));
		}
	}

	/*private Product selectProduct(ProductsList products) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite the name of your desired product: ");
		String name = sc.nextLine();
		while (products.getProduct(name) == null ) {
			System.out.println("\nThere is no Product with that name. Please, type again the name of your desired product: ");
			name = sc.nextLine();
		}
		return products.getProduct(name);
	}*/

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
		System.out.println("\nDo you agree on the terms and conditions of this product? yes/no\n");
		String input = sc.nextLine();
		if (input.equals("yes")) { return true; }
		else { return false; }
	}

	private boolean Confirm(Product product, int quantity, String address) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDo you Confirm the following provided information? yes/no\n Product Name: " + product.getName() + "\nQuantity: " + quantity + "\nAddress: " + address + "\n");
		String input = sc.nextLine();
		if (input.equals("yes")) { System.out.println("You have sucessfully bought your desired product.\n"); return true; }
		else { return false; }		
	}
}