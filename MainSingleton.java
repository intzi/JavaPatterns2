import java.util.ArrayList;

import singleton.MyDatabaseSingleton;
import singleton.User;

public class MainSingleton {

	public static void main(String[] args) {
		
		System.out.println("Design Parretns - Singleton");
		
		
		MyDatabaseSingleton myDB = MyDatabaseSingleton.getInstance();
		
		myDB.addUser(new User("Jim Jimmy", "jiminfo@mail.com"));
		myDB.addUser(new User("Nick nickie", "nickinfo@mail.com"));
		
		MyDatabaseSingleton myDB2 = MyDatabaseSingleton.getInstance();
		
		myDB2.addUser(new User("Nick2 nickie", "nickinfo@mail.com"));
		
		ArrayList<User> usersWithThatEmail = myDB.getUser("nickinfo@mail.com");
		
		System.out.println("\nUsers By Email: ");
		for(User user : usersWithThatEmail)
			System.out.println(user);
		
		
		User userWithThatID = myDB.getUser(1);
		System.out.println("User by ID: ");
		System.out.println(userWithThatID);
		
		// No matter how many times i call .getInstance(), MyDatabase will always return the same instance.
		// The Database instance now is global to the whole project.
		
		
	}

}
