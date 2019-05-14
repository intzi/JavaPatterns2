import player_role.*;

public class PlayerRoleMain {

	public static void main(String[] args) {
		Animal a = new Carnivore(new Aquatic());
		System.out.println(a);
		a.setRole(new Land());
		System.out.println(a);
	}

}
