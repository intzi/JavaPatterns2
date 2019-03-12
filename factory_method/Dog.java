package factory_method;

public class Dog  implements Animal{

	private String createdFrom;
	
	public Dog(String createdFrom) {
		this.createdFrom = createdFrom;
	}
	
	@Override
	public String toString() {
		return "I'm a Dog "+createdFrom;
	}
}
