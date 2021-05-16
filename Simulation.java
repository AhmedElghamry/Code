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
					register();
					continue;
				}
				if (input == 2) {
					User loginUser;
					if (loginUser instanceof Buyer) {
						System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
						int buyIn = scanner.nextInt();
						if (buyIn == 1) {
							
						} 
						else { continue; }
					}
					else if (loginUser instanceof StoreOwner) {
						System.out.println("What do you want to do?\n 1- Add a product.\n 2- Add a Store\n");
						int StoreIn=scanner.nextInt();
						if(StoreIn == 1) {
							
							storesList.get
						}
						else if (StoreIn == 2) {
							System.out.println("Enter the name of the store.\n");
							String StoreName=scanner.nextLine();
							System.out.println("Enter the location of the store.\n");
							String StoreLoc=scanner.nextLine();
							System.out.println("Enter the type of the store.\n");
							String StoreType=scanner.nextLine();
							storesList.add(new Store( StoreName,StoreLoc,StoreType,loginUser));
						}
						
					}
					else {
						System.out.println("What do you want to do?\n 1- Add a product to the website from the StoreOwners.\n 2- Log out\n");
						int AdminIn=scanner.nextInt();
						
						productsList.add(new Product("Apples","Fruits",4,6));
						
					}
				}
				else { break; }
			}
	}
				}
			}
	}

	private static void initializeAdmins(LinkedList usersList) {
		usersList.add(new User("admin","123","admin@zc.edu.eg"));
		//usersList.add(new User("admin","123","admin@zc.edu.eg"));
	}

	private static int takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to do?\n 1- Register\n 2- Login\n 3- Exit\n");
		input = scanner.nextInt();
	/*	if (sc.nextInt() != 1 && sc.nextInt() != 2 && sc.nextInt() != 3)

		else*/
		return input;
	}

	private static void register() {
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
}

