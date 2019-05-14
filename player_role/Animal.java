package player_role;

public class Animal {
	HabitatRole role;
	
	public Animal(HabitatRole role){
		this.role = role;
	}
	
	public void setRole(HabitatRole role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "I'm a "+role.getName()+" animal";
	}
}
