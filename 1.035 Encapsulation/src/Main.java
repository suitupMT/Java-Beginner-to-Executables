

public class Main {

	public static void main(String[] args) {
		// Encapsulation -  attributes of a class will be hidden or private, 
		// Can be accessed only through methods of Getters and Setters
		//You should make attributes private if you don't have a reason for them to be public
		// or protected
		
		Car car = new Car("Chevrolet","Camaro",2022); 
		
		//System.out.println(car.make); cannot access these private variables
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println();
		
		car.setMake("Ford");
		car.setModel("F-150");
		car.setYear(1966);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}
