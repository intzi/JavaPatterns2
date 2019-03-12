import decorator_pattern.Coffee;
import decorator_pattern.Espresso;
import decorator_pattern.Milk;

public class DecoratorMain {
	
	public static void main(String[] args) {
		
		// Espresso Double Milk Decorator
		Coffee espresso = new Espresso();
		espresso = new Milk(espresso);
		espresso = new Milk(espresso);
		System.out.println(espresso.price());
	}
}
