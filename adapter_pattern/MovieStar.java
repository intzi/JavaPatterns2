package adapter_pattern;

public class MovieStar {
	
	private String name;
	
	public MovieStar(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void helloToAllMyFans() {
		System.out.println("Hello, I'd like to say thanks to all my fans");
	}
	
}
