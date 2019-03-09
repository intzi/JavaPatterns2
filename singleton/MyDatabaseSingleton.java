package singleton;

import java.util.ArrayList;

public class MyDatabaseSingleton {

	private static MyDatabaseSingleton myDB;
	private ArrayList<User> users;
	
	private MyDatabaseSingleton(){
		// Setting the constructor as private
		// so that you can't create a new instance.
		// you can get the Database using getInstance()
		users = new ArrayList<>();
	}
	
	public static MyDatabaseSingleton getInstance() {
		if(myDB == null) {
			
			myDB = new MyDatabaseSingleton();
			return myDB;
		}else {
			return myDB;
		}
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
	
	//Get a Users by email
	public ArrayList<User> getUser(String email) {
		
		ArrayList<User> returnUsers = new ArrayList<>();
		for(User u : users)
		{
			if(u.getEmail().equals(email))
				returnUsers.add(u);
		}
		return returnUsers;
	}
	
	//Get User by ID
	public User getUser(int id) {
		// IDs start from 1. Indexes start from 0.
		// I'm removing 1 from the ID
		return users.get(id-1);
	}
}
