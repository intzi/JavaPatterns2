package visitor_pattern;

public interface TaxVisitor {
	double accept(Butter b);
	double accept(Milk m);
	
}
