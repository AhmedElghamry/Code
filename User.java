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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}