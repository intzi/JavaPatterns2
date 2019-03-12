package abstract_factory;

public abstract class Button {
	
	private String name;
	
	public Button(){
		this.name = "Unknown";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
