package visitor_pattern;

public class Milk {
	private double price = 0.0;
	
	public Milk(double price) {
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
}
