
public class Main {

	public static void main(String[] args) {
		// Inheritance = the process where one class acquires the attributes and methods of
			//another class, we call it first class the parent and the inherited class the child 
		
		//you will use inheritance when you have two objects with similar attributes but no all
		//for instance bikes and cars have wheels but other different attributes

		Car car = new Car();
		car.go();  // there is no code in car but is still allowed to call the vehicle method
		Bicycle bike = new Bicycle();
		bike.stop(); // there is no code in bicycle but is still allowed to call the vehicle method
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		
	}

}
