import visitor_pattern.*;

public class VisitorMain {

	public static void main(String[] args) {
//		Milk m = new Milk(2.4);
//		Butter b = new Butter(1.4);
//		
//		TaxCalculator tax = new TaxCalculator();
//		//System.out.println(tax.accept(b));
//		System.out.println(tax.accept(m));

		Integer a = 3; 
		System.out.println(a.hashCode());
		//IntChange(a); 
	}

	public static void IntChange(String x) { 
		x += "3";
	} 

}
