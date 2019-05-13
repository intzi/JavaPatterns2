package visitor_pattern;

public class Butter implements MyItem{

	private double price = 0.0;
	
	public Butter(Double price){
		this.price = price;
	}
	
	public double visitor(TaxVisitor t) {
		return t.accept(this);
	}
	
	public double getPrice(){
		return price;
	}
}
