package decorator_pattern;

public class Espresso extends Coffee{

	public Espresso() {
	}

	@Override
	public double price() {
		return 1.44;
	}

}
