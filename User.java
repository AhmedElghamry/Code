import java.util.*;

public class User {
	private String name, password, email;

	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public boolean register(List registerdUsers) {
		return !registerdUsers.contains(this);
	}

	public boolean login(List registerdUsers) {
		return registerdUsers.contains(this);
	}
}