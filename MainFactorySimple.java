import factory_simple_pattern.CharactersFactory;
import factory_simple_pattern.Human;
import factory_simple_pattern.Orc;
import factory_simple_pattern.Race;
import factory_simple_pattern.Wizard;

public class MainFactorySimple {

	public static void main(String[] args) {
		System.out.println("Design Patterns - Simple Factory");
		
//		Human me = new Human("Jim");
//		System.out.println(me);
//		
//		Wizard wizz = new Wizard("Wizz");
//		System.out.println(wizz);
//		
//		Orc orc = new Orc("Oorrrcc");
//		System.out.println(orc);
		
		// Now.. Instead i'm going to use a Factory to make my Characters.
		// Simple Factory encapsulates the initialization of objects using the same interface into a different class
		
		CharactersFactory cf = new CharactersFactory();
		
		System.out.println("Factory: "+cf.makeCharacter("Jim2", Race.Human));
		System.out.println("Factory: "+cf.makeCharacter("Wizz2", Race.Wizard));
		System.out.println("Factory: "+cf.makeCharacter("Oorrrcc2", Race.Orc));
		
		
	}

}
