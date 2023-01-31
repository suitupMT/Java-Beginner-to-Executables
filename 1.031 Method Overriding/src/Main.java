
public class Main {

	public static void main(String[] args) {
		// method overriding = Declaring a method in sub class,
		//                     which is already present in a parent class. 
		//                     done so that a child class can give its own unique implementation

		Animal animal = new Animal(); 
		Dog dog = new Dog(); 
		
		animal.speak(); // calls the parent class speak
		dog.speak();    //call the method in dog class that overrides the parent class function
		
	}

}
