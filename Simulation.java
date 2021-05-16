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

