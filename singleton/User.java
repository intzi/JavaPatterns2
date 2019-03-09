package singleton;

public class User {
	private static int _ID = 1;
	private int id;
	private String name;
	private String email;
	
	
	public User(String name, String email) {
		this.id = _ID++;
		this.name = name;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("\tUser: %s Email: %s", name, email);
	}
}
