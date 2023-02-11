package task;

public class Main {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("food", "different colors", 0);
		System.out.println(animal1.toString());
		animal1.eat();
		System.out.println(animal1.getVoice());
		animal1.sleep();
		
		System.out.println();
		
		Cat cat1 = new Cat("mouses", "black", 8, "Markiz");
		System.out.println(cat1.toString());
		cat1.eat();
		System.out.println(cat1.getVoice());
		cat1.sleep();
		
		System.out.println();
		
		Dog dog1 = new Dog("bones", "white", 15, "Sharik");
		System.out.println(dog1.toString());
		dog1.eat();
		System.out.println(dog1.getVoice());
		dog1.sleep();
		
		System.out.println();
		
		Veterinarian veterinarian1 = new Veterinarian("Taras");
		System.out.println(veterinarian1.toString());
		veterinarian1.treatment(cat1);

		System.out.println();
		
		Veterinarian veterinarian2 = new Veterinarian("Petro");
		System.out.println(veterinarian2.toString());
		veterinarian2.treatment(dog1);
		
	}

}
