package factory_method;

public class ConcreteAnimalFactory implements AnimalFactory {

	@Override
	public Animal createAnimal(String type) {
		
		Animal animal = null;
		
		if(type.equals("Dog")) {
			animal =  new Dog(" Concrete Factory");
		}else if(type.equals("Cat")) {
			animal = new Cat();
		}
		
		return animal;
	}

}
