package factory_pattern;

public class CharactersFactory {
	
	public Character makeCharacter(String name, Race race) {
		if(race == Race.Human) {
			return new Human(name);
		}else if(race == Race.Wizard){
			return new Wizard(name);
		}else if(race == Race.Orc){
			return new Orc(name);
		}
		
		// Character not found..
		return null;
	}
}
