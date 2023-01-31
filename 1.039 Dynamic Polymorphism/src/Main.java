import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Polymorphism - many forms/types
		// dynamic is after compilation (during runtime)
		
		//ex: a corvette is a corvette and a car and a vehicle and an object

		
		// an animal might be a dog or cat, so we will ask the user and find out at runtime
		//the constructor it chooses will show dynamic polymorphism
		Animal animal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What kind of animal is it? \nType (1) for Dog or (2) for Cat?");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.sound();
		}
		else if (choice == 2) {
			animal = new Cat();
			animal.sound();
		}
		else {
			System.out.println("Invalid option, try again next time.");
			
		}
		
		
		
	}

}
