package factory_simple_pattern;

public class Wizard extends Character{

	public Wizard(String name) {
		race = Race.Wizard;
		setName(name);
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
