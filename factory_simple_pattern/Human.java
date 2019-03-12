package factory_simple_pattern;

public class Human extends Character{

	public Human(String name){
		race = Race.Human;
		setName(name);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
