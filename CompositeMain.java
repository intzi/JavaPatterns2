import composite_pattern.*;

public class CompositeMain {

	public static void main(String[] args) {
//		Item item = new Item("Axe", 3.23);
//		
//		Item mi1 = new Item("Lemons", 0.62);
//		Item mi2 = new Item("Kiwi", 1.24);
//		
//		MultiItems mi4 = new MultiItems("Purchase_1_2", mi1, mi2);
//		MultiItems mi5 = new MultiItems("Purchase_1_1", mi1, mi2);
//		
//		MultiItems mi = new MultiItems("Purchase_1", mi1, mi2, mi4, mi5);
//		
//		
//		Component[] components = new Component[2];
//		components[0] = item;
//		components[1] = mi;
//		
//		String price = "";
//		for(Component c : components)
//			price += c.getName();
//		
//		System.out.println(price);
		
		String h = "es";
		MyClass g = new MyClass();
		System.out.println(h.hashCode());
		System.out.println(g.hashCode());
	}
	

}


class MyClass{
	@Override
	public int hashCode() {
		return 3246;
	}
}