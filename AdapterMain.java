import adapter_pattern.ActorAdapter;
import adapter_pattern.GameCharacter;
import adapter_pattern.MovieStar;
import adapter_pattern.Talkable;

public class AdapterMain {

	public static void main(String[] args) {
		
		System.out.println("Design Patterns - Adapter");
		// Converting the interface of a class to the interface that the client expects
		
		// Creating to irrelevant classes that we want to do the same thing without changing any of the two.
		// Just by using an adapter in the middle
		MovieStar judeLaw = new MovieStar("Jude Law");
		GameCharacter superMario = new GameCharacter();
		
		hello(superMario);
		hello(new ActorAdapter(judeLaw));
		
	}
	
	public static void hello(Talkable character) {
		character.sayHello();
	}

}
