package adapter_pattern;

public class ActorAdapter implements Talkable{

	MovieStar star;
	
	public ActorAdapter(MovieStar star) {
		this.star = star;
	}
	
	
	@Override
	public void sayHello() {
		star.helloToAllMyFans();
	}

}
