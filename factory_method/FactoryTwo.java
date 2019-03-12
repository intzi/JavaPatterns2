package factory_method;

public class FactoryTwo implements AnimalFactory{

	@Override
	public Animal createAnimal(String type) {
		
		Animal animal = null;
		
		if(type.equals("Dog")) {
			animal =  new Dog(" Factory Two");
		}else if(type.equals("Cat")) {
			animal = new Cat();
		}
		
		return animal;
	}

}
