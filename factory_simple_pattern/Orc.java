package factory_simple_pattern;

public class Orc extends Character{
	
	public Orc(String name) {
		race = Race.Orc;
		setName(name);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
