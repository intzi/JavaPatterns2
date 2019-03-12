import abstract_factory.AbstractFactory;
import abstract_factory.Alert;
import abstract_factory.Button;
import abstract_factory.LinuxFactory;
import abstract_factory.WindowsFactory;

public class AbstractFactoryMain {
	
	public static void main(String[] args) {
		
		// Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
		// Here the interface should be able to create multiple or families of objects compared to the factory method which has just one method.
		// So if factory method is creating an interface for a single object, here we have many.
		
		
		// AbstractFactory
		AbstractFactory factory = new WindowsFactory();
		Alert alert = factory.createAlert("SadAlert", "Hello");
		factory = new LinuxFactory();
		Button button = factory.createButton("HappyButton");
		
		
		System.out.println("Button name: "+button.getName());
		System.out.println("Alert msg: "+alert.getMessage());
		
	}

}
