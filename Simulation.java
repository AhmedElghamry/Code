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
					continue;
				}
				else if (input == 2) {
					User loginUser = Login(usersList);
					if (loginUser instanceof Buyer) {
						System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
						int buyIn = sc.nextInt();
						while (buyIn == 1) {
							loginUser.buy();
							System.out.println("What do you want to do?\n 1- Buy a Product\n 2- Log out\n");
							buyIn = sc.nextInt();
							continue;
						} 						
						continue;
					}
					else if (loginUser instanceof StoreOwner) {


					}
					else {

					}
				}
				else { break; }
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
	/*	if (sc.nextInt() != 1 && sc.nextInt() != 2 && sc.nextInt() != 3)

		else*/
		return input;
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
	}

}

