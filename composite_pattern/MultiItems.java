package composite_pattern;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiItems implements Component{
	
	private String name;
	private ArrayList<Component> items;
	
	
	public MultiItems(String name) {
		this.name = name;
		this.items = new ArrayList<Component>();
	}
	
	public MultiItems(String name, Component... items){
		this.name = name;
		this.items = new ArrayList<Component>(Arrays.asList(items));
	}
	
	public void add(Component a) {
		items.add(a);
	}
	
	public void remove(Component a) {
		items.remove(a);
	}
	
	
	public Double compPrice() {
		
		Double p = 0.0;
		
		for(Component c : items) {
			p += c.compPrice();
		}
		
		return p;
	}
	
	public String getName() {
		String name = "";
		
		for(Component c : items) {
			name += c.getName() + " ";
		}
		name = name.replaceAll("\\s+", " ");
		return name;
	}
}
