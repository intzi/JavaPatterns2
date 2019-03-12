import factory_method.Animal;
import factory_method.AnimalFactory;
import factory_method.ConcreteAnimalFactory;
import factory_method.FactoryTwo;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		// Define an interface for creating an object, but let subclasses decide which class to instantiate
		// In this case.. AnimalFactory is the interface
		// ConcreteAnimalFactory and Factory two are the subclasses
		// that decide how the object will be created.
		
		System.out.println("Design Patterns - Factory Method");
		AnimalFactory factory = new ConcreteAnimalFactory();
		Animal animal = factory.createAnimal("Dog");
		
		AnimalFactory factory2 = new FactoryTwo();
		Animal animal2 = factory2.createAnimal("Dog");
		
		if(animal != null) {
			System.out.println(animal);
			System.out.println(animal2);
		}
		
	}

}
