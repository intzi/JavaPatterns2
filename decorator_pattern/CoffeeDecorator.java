package decorator_pattern;

public abstract class CoffeeDecorator extends Coffee{

	Coffee component;
	
	public CoffeeDecorator(Coffee component) {
		this.component = component;
	}

	@Override
	public abstract double price();
	
}
