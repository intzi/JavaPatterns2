import facade_pattern.Heater;
import facade_pattern.HouseFacade;
import facade_pattern.Light;
import facade_pattern.Tv;

public class FacadeMain {
	
	public static void main(String[] args) {

		//A facade is an object that provides a simplified interface to a larger body of code, such as a class library
		System.out.println("Design Patterns - Facede");

		Heater heater = new Heater();
		Light light = new Light();
		Tv tv = new Tv();
		
		HouseFacade house = new HouseFacade(heater, light, tv);
		house.relaxing();
		
		
		System.out.println(light);
		System.out.println(heater);
		System.out.println(tv);
		
	}
}
