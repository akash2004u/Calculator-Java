
public class Polymorph {

	public static void main(String[] args) {
		//new Animal();
		Cat cat = new Cat();	 	//object of subclass cat
		Dog dog = new Dog();		
		Vehicle car = new Vehicle(1);
		Vehicle bike = new Vehicle(4);
		
		System.out.println("Combined age of cat and dog is " + sum(cat,dog));
		System.out.println("Combined age of cat and dog is " + sum(car, bike));
	}
	
	private static int sum(Animal a, Animal b) {
	   return a.animalAge() + b.animalAge();
	}
	
	private static int sum(Vehicle a, Vehicle b) {
		return 0;
	}
}

class Vehicle {
    int age;
    public Vehicle(int age) {
	this.age = age;
    }
}

class Animal {   // superclass
	short animalAge() {
		return 0;
	}
}

class Cat extends Animal {	//subclass inherits Animal
	short animalAge() {
		return 12;
	}
}

class Dog extends Animal { // subclass inherits Animal
	short animalAge() {
		return 8;
	}
}
