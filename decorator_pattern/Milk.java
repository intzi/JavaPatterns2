package decorator_pattern;

public class Milk extends CoffeeDecorator {

	public Milk(Coffee component) {
		super(component);
	}

	@Override
	public double price() {
		return 0.25 + component.price();
	}

}
