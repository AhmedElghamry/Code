import java.util.*;

public class Simulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductsList productsList = new ProductsList();
		List storesList = new LinkedList<Store>();
		List usersList = new LinkedList();
		initializeAdmins(usersList);
		int input = takeInput();
		while(input != 0) {
			if (input == 1) {
				register(usersList);
			}

			if (input == 2) {
				User loginUser = Login(usersList);
				if (loginUser == null) { continue; }
				if (loginUser instanceof Buyer) {
					Buyer loginBuyer = (Buyer)loginUser;
					System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
					int buyIn = sc.nextInt();
					while (buyIn == 1) {
						loginBuyer.buy(productsList);
						System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
						buyIn = sc.nextInt();
					} 						
				}
				else if (loginUser instanceof StoreOwner) {
					StoreOwner loginStoreOwner = (StoreOwner)loginUser;					
					System.out.println("What do you want to do?\n 1- Add a product.\n 2- Add a Store\n 3- Log Out\n");
					int storeIn = sc.nextInt();
					while (storeIn == 1 || storeIn == 2) {
						if (storeIn == 1) { loginStoreOwner.addProduct(productsList);	}
						else if (storeIn == 2) {
							Store store = loginStoreOwner.addStore();
							storesList.add(store);
						}
						System.out.println("What do you want to do?\n 1- Add a product.\n 2- Add a Store\n 3- Log Out\n");
						storeIn = sc.nextInt();		
					}			
				}

				else {
					System.out.println("What do you want to do?\n 1- Add a product to the System.\n 2- Log out\n");
					int adminIn = sc.nextInt();
					while (adminIn == 1) { 		
						adminAddsProduct(productsList);
						System.out.println("What do you want to do?\n 1- Add a product to the System.\n 2- Log out\n");
						adminIn = sc.nextInt();				
					}
				}
			}
			input = takeInput();
		}
	}

	private static void initializeAdmins(List usersList) {
		usersList.add(new User("admin","123","admin@zc.edu.eg"));
		//usersList.add(new User("admin","123","admin@zc.edu.eg"));
	}


	private static int takeInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to do?\n 1- Register\n 2- Login\n 3- Exit\n");
		int input = scanner.nextInt();
		if (input != 1 && input != 2)
			return 0;
		else
			return input;
	}

	private static void adminAddsProduct(ProductsList products) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the name of the product: ");
		String name = scanner.nextLine();
		System.out.println("\nEnter the category of the product: ");
		String category = scanner.nextLine();
		System.out.println("\nEnter the minimum price of the product: ");
		double minPrice = scanner.nextDouble();
		System.out.println("\nEnter the maximum price of the product: ");
		double maxPrice = scanner.nextDouble();
		products.addProduct(new Product(name,category,minPrice,maxPrice));
	}


	private static void register(List usersList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWrite your Name: ");
		String name = sc.nextLine();
		System.out.println("\nWrite your Email: ");
		String email = sc.nextLine();
		System.out.println("\nWrite your Password: ");
		String password = sc.nextLine();
		System.out.println("\nChoose: 1- Buyer | 2- Store Owner\n");
		int in = sc.nextInt();
		if (in == 1) { usersList.add(new Buyer(name,password,email)); }
		else { usersList.add(new StoreOwner(name,password,email)); }
		System.out.println("\nWelcome " + name + ", you have been registered successfully. Please, Login again!");
	}

	private static User Login(List usersList) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("\n Email/Username: ");
			String email = sc.nextLine();
			System.out.println("\n Password: ");
			String pass = sc.nextLine();
			for (Iterator i = usersList.iterator(); i.hasNext(); ) {
				User u = (User) i.next();
				if ((u.getEmail().equals(email) || u.getName().equals(email)) && u.getPassword().equals(pass)) { return u; }
			}
		System.out.println("\nNo such user, Are you registered? y/n");
		if (sc.nextLine() == "n") { flag = false; }
		}
		return null;
	}
}