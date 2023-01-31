
public class Dog extends Animal{

	// nothing special here except its the same name as the parent class method
	@Override //best practices to right this key phrase above overriding methods but not necessary
	 void speak() {
		System.out.println("Bark Bark!");
	}
}
