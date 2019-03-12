package factory_simple_pattern;

public abstract class Character {
	
	private static int _ID = 0;
	private int id;
	protected String name;
	protected Race race;
	
	public Character() {
		id = _ID++;
		name = "";
		race = Race.Unknown;
	}
	
	public abstract void setName(String name);
	
	@Override
	public String toString() {
		return id+") "+race+" Character: "+name;
	}
}



