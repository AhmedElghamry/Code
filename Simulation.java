import java.util.*;

public class Simulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductsList productsList = new ProductsList();
		List storesList = new LinkedList<Store>;
		List usersList = new LinkedList<User>;
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
					System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
					int buyIn = sc.nextInt();
					while (buyIn == 1) {
						loginUser.buy();
						System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
						buyIn = sc.nextInt();
					} 						
				}
				else if (loginUser instanceof StoreOwner) {
					System.out.println("What do you want to do?\n 1- Add a product.\n 2- Add a Store\n 3- Log Out\n");
					int storeIn = sc.nextInt();
					while (StoreIn == 1 || StoreIn == 2) {
						if (StoreIn == 1) { loginUser.addProduct(productsList);	}
						else if (StoreIn == 2) {
							Store store = loginUser.addStore();
							storesList.add(store);
						}
						System.out.println("What do you want to do?\n 1- Add a product.\n 2- Add a Store\n 3- Log Out\n");
						storeIn = sc.nextInt();		
					}			
				}

				else {
					System.out.println("What do you want to do?\n 1- Add a product to the System.\n 2- Log out\n");
					int adminIn = scanner.nextInt();
					while (adminIn == 1) { 		
						adminAddsProduct(productsList);
						System.out.println("What do you want to do?\n 1- Add a product to the System.\n 2- Log out\n");
						adminIn = scanner.nextInt();				
					}
				}
			}
			input = takeInput();
		}
	}

	private static void initializeAdmins(LinkedList usersList) {
		usersList.add(new User("admin","123","admin@zc.edu.eg"));
		//usersList.add(new User("admin","123","admin@zc.edu.eg"));
	}


	private static int takeInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to do?\n 1- Register\n 2- Login\n 3- Exit\n");
		input = scanner.nextInt();
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
		products.add(new Product(name,category,minPrice,maxPrice));
	}


	private static void register(LinkedList usersList) {
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

	private static User Login(LinkedList usersList) {
		boolean flag = true;
		while (flag) {
			System.out.println("\n Email/Username: ");
			String email = sc.nextLine();
			System.out.println("\n Password: ");
			String pass = sc.nextLine();
			for (Iterator i = usersList.iterator(); i.hasNext(); ) {
				User u = (User) i.next();
				if ((u.getEmail().equals(email) || u.getName().equals(email)) && u.getPassword.equals(pass)) { return u; }
			}
		System.out.println("\nNo such user, Are you registered? y/n");
		if (sc.nextLine() == "n") { flag = false; }
		}
		return null;
	}
}