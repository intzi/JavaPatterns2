package visitor_pattern;

public class TaxCalculator implements TaxVisitor{

	private final double TAX = 1.23;
	
	public double accept(Butter b) {
		return b.getPrice() * TAX;
	}
	
	public double accept(Milk m) {
		return m.getPrice() * TAX;
	}
}
