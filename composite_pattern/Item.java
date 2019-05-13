package composite_pattern;

public class Item implements Component{
	
	private String name;
	private Double price;
	
	public Item(String name, Double price){
		this.name = name;
		this.price = price;
	}
	
	public Double getPrice(){
		return price;
	}
	
	@Override
	public Double compPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

}
